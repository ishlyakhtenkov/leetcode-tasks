package ru.javaprojects.leetcode_tasks.contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;

//        Set<Integer> numbers = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (numbers.contains(nums[i])) {
//                return true;
//            }
//            numbers.add(nums[i]);
//        }
//        return false;
    }
}
