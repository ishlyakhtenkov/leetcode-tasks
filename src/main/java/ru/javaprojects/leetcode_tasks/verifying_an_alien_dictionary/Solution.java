package ru.javaprojects.leetcode_tasks.verifying_an_alien_dictionary;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> charIndex = new HashMap<>();
        char[] chars = order.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            charIndex.put(chars[i], i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String first = words[i];
            String second = words[i + 1];
            boolean oneIsPartOfAnother = true;
            int minLength = Math.min(first.length(), second.length());
            for (int j = 0; j < minLength; j++) {
                if (charIndex.get(first.charAt(j)) < charIndex.get(second.charAt(j))) {
                    oneIsPartOfAnother = false;
                    break;
                } else if (charIndex.get(first.charAt(j)) > charIndex.get(second.charAt(j))) {
                    return false;
                }
            }
            if (oneIsPartOfAnother && second.length() < first.length()) {
                return false;
            }
        }
        return true;
    }
}
