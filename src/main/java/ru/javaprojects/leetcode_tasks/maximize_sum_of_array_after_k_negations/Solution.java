package ru.javaprojects.leetcode_tasks.maximize_sum_of_array_after_k_negations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        List<Integer> negativeNums = new ArrayList<>();
        boolean hasZero = false;
        int smallestPositiveNum = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            if (num < 0) {
                negativeNums.add(num);
            } else if (!hasZero && num == 0) {
                hasZero = true;
            } else if (num < smallestPositiveNum) {
                smallestPositiveNum = num;
            }
            sum += num;
        }
        Collections.sort(negativeNums);
        if (negativeNums.size() == 0) {
            if (hasZero || k % 2 == 0) {
                return sum;
            } else {
                return sum - smallestPositiveNum * 2;
            }
        } else {
            int cursor = 0;
            while (k > 0 && cursor < negativeNums.size()) {
                sum += -negativeNums.get(cursor) * 2;
                k--;
                cursor++;
            }
            if (hasZero || k % 2 == 0) {
                return sum;
            } else {
                if (smallestPositiveNum > -negativeNums.get(negativeNums.size() - 1)) {
                    // -5 -2 3    -4     10  6
                    return sum - (-negativeNums.get(negativeNums.size() - 1) * 2);
                } else {
                    return sum - smallestPositiveNum * 2;
                }
            }
        }
    }
}
