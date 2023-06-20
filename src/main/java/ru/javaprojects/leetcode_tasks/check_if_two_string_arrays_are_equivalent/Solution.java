package ru.javaprojects.leetcode_tasks.check_if_two_string_arrays_are_equivalent;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sbWord1 = new StringBuilder();
        StringBuilder sbWord2 = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length, word2.length); i++) {
            if (i < word1.length) {
                sbWord1.append(word1[i]);
            }
            if (i < word2.length) {
                sbWord2.append(word2[i]);
            }
            if (sbWord1.length() <= sbWord2.length() && !sbWord2.toString().startsWith(sbWord1.toString())) {
                return false;
            }
            if (sbWord1.length() > sbWord2.length() && !sbWord1.toString().startsWith(sbWord2.toString())) {
                return false;
            }
        }
        return sbWord1.toString().equals(sbWord2.toString());
    }
}