package ru.javaprojects.leetcode_tasks.most_common_word;

import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(List.of(banned));
        bannedWords.add("");
        String[] words = paragraph.replaceAll("\\p{Punct}", " ").toLowerCase().split(" ");
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words) {
            if (!bannedWords.contains(word)) {
                counter.merge(word, 1, Integer::sum);
            }
        }
        return counter.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
    }
}
