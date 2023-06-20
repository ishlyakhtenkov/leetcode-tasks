package ru.javaprojects.leetcode_tasks.find_words_that_can_be_formed_by_characters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charCounter.merge(c, 1, Integer::sum);
        }

        int wordsLengthSum = 0;
        wordCycleLabel:
        for (String word : words) {
            char[] wordChars = word.toCharArray();
            Map<Character, Integer> tempCharCounter = new HashMap<>(charCounter);
            for (char c : wordChars) {
                Integer count = tempCharCounter.get(c);
                if (count == null) {
                    continue wordCycleLabel;
                } else if (count == 1) {
                    tempCharCounter.remove(c);
                } else {
                    tempCharCounter.put(c, count - 1);
                }
            }
            wordsLengthSum += word.length();
        }
        return wordsLengthSum;
    }
}