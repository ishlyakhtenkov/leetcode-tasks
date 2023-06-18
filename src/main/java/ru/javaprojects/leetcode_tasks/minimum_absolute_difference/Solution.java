package ru.javaprojects.leetcode_tasks.minimum_absolute_difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minDifference) {
                minDifference = arr[i + 1] - arr[i];
            }
        }
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDifference) {
                pairs.add(List.of(arr[i], arr[i + 1]));
            }
        }
        return pairs;
    }
}
