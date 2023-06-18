package ru.javaprojects.leetcode_tasks.split_a_string_in_balanced_strings;

class Solution {
    public int balancedStringSplit(String s) {
        int rCounter = 0;
        int lCounter = 0;
        int maxNumberOfBalancedStrings = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {
                rCounter++;
            } else {
                lCounter++;
            }
            if (rCounter == lCounter) {
                maxNumberOfBalancedStrings++;
                rCounter = 0;
                lCounter = 0;
            }
        }
        return maxNumberOfBalancedStrings;
    }
}
