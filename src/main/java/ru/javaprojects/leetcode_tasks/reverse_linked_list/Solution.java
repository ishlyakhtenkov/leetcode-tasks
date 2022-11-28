package ru.javaprojects.leetcode_tasks.reverse_linked_list;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode result = new ListNode(list.get(list.size() - 1));
        ListNode resultPointer = result;
        for (int i = list.size() - 2; i >= 0; i--) {
            resultPointer.next = new ListNode(list.get(i));
            resultPointer = resultPointer.next;
        }
        return result;
    }
}