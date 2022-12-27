package ru.javaprojects.leetcode_tasks.reverse_words_in_a_string_III;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]);
            builder.append(" ");
        }
        return builder.reverse().toString().trim();
    }
}
