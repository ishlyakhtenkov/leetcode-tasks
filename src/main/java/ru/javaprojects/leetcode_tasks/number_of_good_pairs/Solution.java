package ru.javaprojects.leetcode_tasks.number_of_good_pairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, List<Integer>> numberIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexes = numberIndexes.computeIfAbsent(nums[i], k -> new ArrayList<>());
            indexes.add(i);
        }
        int goodPairsCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexes = numberIndexes.get(nums[i]);
            if (indexes.size() != 1) {
                for (int index : indexes) {
                    if (index > i) {
                        goodPairsCounter++;
                    }
                }
            }
        }
        return goodPairsCounter;
    }
}
