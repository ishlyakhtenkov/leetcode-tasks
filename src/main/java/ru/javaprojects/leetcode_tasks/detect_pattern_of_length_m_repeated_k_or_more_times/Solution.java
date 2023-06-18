package ru.javaprojects.leetcode_tasks.detect_pattern_of_length_m_repeated_k_or_more_times;

class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        mainLoop:
        for (int i = 0; i <= arr.length - m * k; i++) {
            int iteration = 1;
            int repeats = k - 1;
            while (repeats > 0) {
                for (int j = iteration * m + i, z = i; j < iteration * m + i + m; j++, z++) {
                    if (arr[z] != arr[j]) {
                        continue mainLoop;
                    }
                }
                repeats--;
                iteration++;
            }
            return true;
        }
        return false;
    }
}
