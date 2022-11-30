package ru.javaprojects.leetcode_tasks.length_of_last_word;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
