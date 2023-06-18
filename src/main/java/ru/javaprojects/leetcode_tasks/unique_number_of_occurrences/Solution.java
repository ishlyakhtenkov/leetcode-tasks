package ru.javaprojects.leetcode_tasks.unique_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> intCounter = new HashMap<>();
        for (int i : arr) {
            intCounter.merge(i, 1, Integer::sum);
        }
        return new HashSet<>(intCounter.values()).size() == intCounter.size();
    }
}
