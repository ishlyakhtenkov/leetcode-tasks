package ru.javaprojects.leetcode_tasks.kth_missing_positive_number;

class Solution {

    public int findKthPositive(int[] arr, int k) {
        for (int i = 1; i < arr[0]; i++) {
            k--;
            if (k == 0) {
                return i;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                    k--;
                    if (k == 0) {
                        return j;
                    }
                }
            }
        }
        return arr[arr.length - 1] + k;
    }
}
