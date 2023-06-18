package ru.javaprojects.leetcode_tasks.n_repeated_element_in_size_2n_array;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            boolean notContains = numbers.add(num);
            if (!notContains) {
                return num;
            }
        }
        throw new RuntimeException();
    }
}
