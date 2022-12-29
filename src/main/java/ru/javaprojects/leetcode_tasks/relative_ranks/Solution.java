package ru.javaprojects.leetcode_tasks.relative_ranks;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ranks = new String[score.length];
        Map<Integer, Integer> scoreIndexes = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            scoreIndexes.put(score[i], i);
        }
        Set<Map.Entry<Integer, Integer>> entries = scoreIndexes.entrySet();
        int counter = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (counter == 0) {
                ranks[entry.getValue()] = "Gold Medal";
            } else if (counter == 1) {
                ranks[entry.getValue()] = "Silver Medal";
            } else if (counter == 2) {
                ranks[entry.getValue()] = "Bronze Medal";
            } else {
                ranks[entry.getValue()] = "" + (counter + 1);
            }
            counter++;
        }
        return ranks;
    }
}