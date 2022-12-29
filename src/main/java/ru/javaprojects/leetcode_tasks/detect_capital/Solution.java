package ru.javaprojects.leetcode_tasks.detect_capital;

class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        boolean firstLetterCapital = Character.isUpperCase(word.charAt(0));
        boolean allLettersCapital = (firstLetterCapital && Character.isUpperCase(word.charAt(1)));

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if ((Character.isUpperCase(c) && !allLettersCapital) || (Character.isLowerCase(c) && allLettersCapital)) {
                return false;
            }
        }
        return true;
    }
}