package ru.javaprojects.leetcode_tasks.generate_a_string_with_characters_that_have_odd_counts;

class Solution {
    public String generateTheString(int n) {
        byte[] characters = new byte[n];
        if (n == 1) {
            return "a";
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                characters[i] = 97;
            }
            characters[n - 1] = 98;
        } else {
            for (int i = 0; i < n - 2; i++) {
                characters[i] = 97;
            }
            characters[n - 2] = 98;
            characters[n - 1] = 99;
        }
        return new String(characters);
    }
}
