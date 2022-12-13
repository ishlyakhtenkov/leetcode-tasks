package ru.javaprojects.leetcode_tasks.find_all_numbers_disappeared_in_array;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<>();

        Set<Integer> intSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= nums.length; i++) {
            if (!intSet.contains(i)) {
                integers.add(i);
            }
        }

        return integers;
    }
}
