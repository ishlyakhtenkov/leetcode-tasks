package ru.javaprojects.leetcode_tasks.reverse_linked_list;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reverseList() {
        ListNode source = new ListNode(1);
        source.next = new ListNode(2);
        source.next.next = new ListNode(3);
        source.next.next.next = new ListNode(4);
        source.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode reverseList = solution.reverseList(source);
        System.out.println();
    }
}