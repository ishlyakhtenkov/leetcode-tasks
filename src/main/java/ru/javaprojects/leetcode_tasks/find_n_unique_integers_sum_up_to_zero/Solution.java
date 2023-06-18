package ru.javaprojects.leetcode_tasks.find_n_unique_integers_sum_up_to_zero;

class Solution {
    public int[] sumZero(int n) {
        int[] addUpTo0Ints = new int[n];

        for (int i = 0, j = 0; i < n / 2; i++, j+=2) {
            addUpTo0Ints[j] = i + 1;
            addUpTo0Ints[j + 1] = -(i + 1);
        }

        if (n % 2 == 1) {
            addUpTo0Ints[n - 1] = 0;
        }
        return addUpTo0Ints;
    }
}