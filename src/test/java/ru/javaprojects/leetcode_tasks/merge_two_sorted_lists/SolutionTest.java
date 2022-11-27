package ru.javaprojects.leetcode_tasks.merge_two_sorted_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTwoLists() {
        Solution solution = new Solution();
        ListNode list1 = null;
        ListNode list2 = null;
        assertNull(solution.mergeTwoLists(list1, list2));

        list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = solution.mergeTwoLists(list1, list2);
        System.out.println();
    }
}