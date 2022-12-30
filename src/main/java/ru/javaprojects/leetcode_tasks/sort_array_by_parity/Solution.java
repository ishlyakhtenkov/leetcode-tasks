package ru.javaprojects.leetcode_tasks.sort_array_by_parity;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] sorted = new int[nums.length];
        int evenCounter = 0;
        int oddCounter = sorted.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                sorted[evenCounter] = num;
                evenCounter++;
            } else {
                sorted[oddCounter] = num;
                oddCounter--;
            }
        }
        return sorted;
    }
}