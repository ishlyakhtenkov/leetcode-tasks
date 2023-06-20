package ru.javaprojects.leetcode_tasks.shuffle_string;

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] shuffledChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            shuffledChars[indices[i]] = chars[i];
        }
        return new String(shuffledChars);
    }
}
