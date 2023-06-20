package ru.javaprojects.leetcode_tasks.minimum_changes_to_make_alternating_binary_string;

class Solution {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int startFromOneCounter = chars[0] == '1' ? 0 : 1;
        chars[0] = '1';
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                chars[i] = chars[i] == '1' ? '0' : '1';
                startFromOneCounter++;
            }
        }
        chars = s.toCharArray();
        int startFromZeroCounter = chars[0] == '0' ? 0 : 1;
        chars[0] = '0';
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                chars[i] = chars[i] == '1' ? '0' : '1';
                startFromZeroCounter++;
            }
        }
        return Math.min(startFromOneCounter, startFromZeroCounter);
    }
}