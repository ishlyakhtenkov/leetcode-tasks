package ru.javaprojects.leetcode_tasks.word_pattern;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, Character> patternWordChars = new HashMap<>();
        Map<Character, Character> wordPatternChars = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            Character patternWordChar = patternWordChars.putIfAbsent(pattern.charAt(i), words[i].charAt(0));
            Character wordPatternChar = wordPatternChars.putIfAbsent(words[i].charAt(0), pattern.charAt(i));

            if (patternWordChar != null && patternWordChar != words[i].charAt(0)) {
                return false;
            }

            if (patternWordChar == null && wordPatternChar != null && wordPatternChar != pattern.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}