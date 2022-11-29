package ru.javaprojects.leetcode_tasks.remove_duplicates_from_sorted_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void deleteDuplicates() {
        Solution solution = new Solution();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);

        ListNode result = solution.deleteDuplicates(listNode);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);

        listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next = new ListNode(3);
        result = solution.deleteDuplicates(listNode);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertNull(result.next.next.next);
    }
}