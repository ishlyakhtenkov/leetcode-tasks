package ru.javaprojects.leetcode_tasks.next_greater_element_I;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        Map<Integer, Integer> numIndexes = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            numIndexes.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            int index = numIndexes.get(nums1[i]);
            boolean hasGreater = false;
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    hasGreater = true;
                    result[i] = nums2[j];
                    break;
                }
            }
            if (!hasGreater) {
                result[i] = -1;
            }
        }
        return result;
    }
}
