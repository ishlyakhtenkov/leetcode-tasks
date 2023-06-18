package ru.javaprojects.leetcode_tasks.string_matching_in_an_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    substrings.add(words[i]);
                }
            }
        }
        return new ArrayList<>(substrings);
    }
}
