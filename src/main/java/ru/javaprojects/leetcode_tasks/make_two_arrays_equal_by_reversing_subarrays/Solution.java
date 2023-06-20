package ru.javaprojects.leetcode_tasks.make_two_arrays_equal_by_reversing_subarrays;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> targetNumbersCounter = new HashMap<>();
        for (int num : target) {
            targetNumbersCounter.merge(num, 1, Integer::sum);
        }
        for (int num : arr) {
            Integer numberCounter = targetNumbersCounter.get(num);
            if (numberCounter == null) {
                return false;
            }
            if (numberCounter == 1) {
                targetNumbersCounter.remove(num);
            } else {
                targetNumbersCounter.put(num, numberCounter - 1);
            }
        }
        return true;
    }
}
