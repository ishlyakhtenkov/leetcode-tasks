package ru.javaprojects.leetcode_tasks.keyboard_row;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution {
    static Set<Character> firstRow = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
    static Set<Character> secondRow = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
    static Set<Character> thirdRow = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isOneRowTyped(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    private boolean isOneRowTyped(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        boolean isOneRowTyped = true;

        for (int i = 0; i < chars.length; i++) {
            if (!firstRow.contains(chars[i])) {
                isOneRowTyped = false;
                break;
            }
        }

        if (!isOneRowTyped) {
            isOneRowTyped = true;
            for (int i = 0; i < chars.length; i++) {
                if (!secondRow.contains(chars[i])) {
                    isOneRowTyped = false;
                    break;
                }
            }
        }

        if (!isOneRowTyped) {
            isOneRowTyped = true;
            for (int i = 0; i < chars.length; i++) {
                if (!thirdRow.contains(chars[i])) {
                    isOneRowTyped = false;
                    break;
                }
            }
        }

        return isOneRowTyped;
    }
}
