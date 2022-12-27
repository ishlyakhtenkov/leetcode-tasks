package ru.javaprojects.leetcode_tasks.longest_palindrome;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        int longestLength = 0;
        Map<Character, Integer> charCounter = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            charCounter.merge(chars[i], 1, Integer::sum);
        }

        for (int counter : charCounter.values()) {
            longestLength += counter - counter % 2;
        }

        if (s.length() % 2 != 0 || s.length() != longestLength) {
            longestLength++;
        }

        return longestLength;
    }
}
