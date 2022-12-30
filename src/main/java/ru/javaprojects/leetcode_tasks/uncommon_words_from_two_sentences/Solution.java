package ru.javaprojects.leetcode_tasks.uncommon_words_from_two_sentences;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Words = s1.split(" ");
        String[] s2Words = s2.split(" ");
        Map<String, Long> s1WordsCounter = Arrays.stream(s1Words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        Map<String, Long> s2WordsCounter = Arrays.stream(s2Words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        List<String> uncommonWords = new ArrayList<>();
        s1WordsCounter.entrySet().stream()
                .filter(entry -> entry.getValue() == 1 && !s2WordsCounter.containsKey(entry.getKey()))
                .map(Map.Entry::getKey)
                .forEach(uncommonWords::add);
        s2WordsCounter.entrySet().stream()
                .filter(entry -> entry.getValue() == 1 && !s1WordsCounter.containsKey(entry.getKey()))
                .map(Map.Entry::getKey)
                .forEach(uncommonWords::add);
        return uncommonWords.toArray(new String[0]);
    }
}
