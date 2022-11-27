package ru.javaprojects.leetcode_tasks.merge_two_sorted_lists;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode list1Pointer = list1;
        ListNode list2Pointer = list2;

        ListNode result;

        // Find head of the result
        if (list1Pointer == null) {
            result = new ListNode(list2Pointer.val);
            list2Pointer = list2Pointer.next;
        } else if (list2Pointer == null) {
            result = new ListNode(list1Pointer.val);
            list1Pointer = list1Pointer.next;
        } else {
            if (list1Pointer.val <= list2Pointer.val) {
                result = new ListNode(list1Pointer.val);
                list1Pointer = list1Pointer.next;
            } else {
                result = new ListNode(list2Pointer.val);;
                list2Pointer = list2Pointer.next;
            }
        }

        ListNode resultPointer = result;

        // Find other nodes of the result
        while (list1Pointer != null || list2Pointer != null) {
            if (list1Pointer == null) {
                resultPointer.next = new ListNode(list2Pointer.val);
                list2Pointer = list2Pointer.next;
            } else if (list2Pointer == null) {
                resultPointer.next = new ListNode(list1Pointer.val);
                list1Pointer = list1Pointer.next;
            } else {
                if (list1Pointer.val <= list2Pointer.val) {
                    resultPointer.next = new ListNode(list1Pointer.val);
                    list1Pointer = list1Pointer.next;
                } else {
                    resultPointer.next = new ListNode(list2Pointer.val);
                    list2Pointer = list2Pointer.next;
                }
            }
            resultPointer = resultPointer.next;
        }
        return result;
    }
}
