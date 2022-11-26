package ru.javaprojects.leetcode_tasks.merge_sorted_array;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        for (int i = 0, j = 0, k = 0; i < result.length; i++) {
            if (j >= m) {
                result[i] = nums2[k];
                k++;
            } else if (k >= n) {
                result[i] = nums1[j];
                j++;
            } else if (nums1[j] <= nums2[k]) {
                result[i] = nums1[j];
                j++;
            } else {
                result[i] = nums2[k];
                k++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }
}
