package ru.javaprojects.leetcode_tasks.single_number;

import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> processedNumbers = new HashSet<>();
        for (int num : nums) {
            if (processedNumbers.contains(num)) {
                processedNumbers.remove(num);
            } else {
                processedNumbers.add(num);
            }
        }
        return processedNumbers.iterator().next();
    }
}
