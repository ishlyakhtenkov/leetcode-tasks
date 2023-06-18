package ru.javaprojects.leetcode_tasks.how_many_numbers_are_smaller_than_the_current_number;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNumbersCounter = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smallerNumbersAmount = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    smallerNumbersAmount++;
                }
            }
            smallerNumbersCounter[i] = smallerNumbersAmount;
        }
        return smallerNumbersCounter;
    }
}