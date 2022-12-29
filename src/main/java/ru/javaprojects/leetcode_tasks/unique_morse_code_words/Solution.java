package ru.javaprojects.leetcode_tasks.unique_morse_code_words;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueRepresentations = new HashSet<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                stringBuilder.append(morse[chars[i] - 97]);
            }
            uniqueRepresentations.add(stringBuilder.toString());
        }
        return uniqueRepresentations.size();
    }
}
