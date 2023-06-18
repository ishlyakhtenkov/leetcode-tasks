package ru.javaprojects.leetcode_tasks.majority_element;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int halfLength = nums.length / 2;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            Integer numCounter = counter.merge(num, 1, Integer::sum);
            if (numCounter > halfLength) {
                return num;
            }
        }
        throw new IllegalArgumentException("array does not have majority element");
    }
}
