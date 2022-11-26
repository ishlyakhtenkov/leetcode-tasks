package ru.javaprojects.leetcode_tasks.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = numbers.get(target - nums[i]);
            if (index != null && index != i) {
                return new int[]{i, index};
            }
        }
        throw new IllegalArgumentException();
    }
}