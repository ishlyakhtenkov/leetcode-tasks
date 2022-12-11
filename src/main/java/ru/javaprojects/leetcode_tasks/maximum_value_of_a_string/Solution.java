package ru.javaprojects.leetcode_tasks.maximum_value_of_a_string;

class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            int length;
            if (strs[i].matches(".*[a-zA-Z].*")) {
                length = strs[i].length();
            } else {
                length = Integer.parseInt(strs[i]);
            }
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
