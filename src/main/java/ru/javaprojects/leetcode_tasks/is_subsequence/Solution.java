package ru.javaprojects.leetcode_tasks.is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        char[] sChars = s.toCharArray();
        int previousCharIndex = -1;
        for (int i = 0; i < sChars.length; i++) {
            int charIndex = t.indexOf(sChars[i], previousCharIndex + 1);
            if (charIndex == -1 || charIndex < previousCharIndex) {
                return false;
            }
            previousCharIndex = charIndex;
        }
        return true;
    }
}