package ru.javaprojects.leetcode_tasks.find_common_characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> firstWordCharCounter = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            firstWordCharCounter.merge(c, 1, Integer::sum);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> wordCharCounter = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                wordCharCounter.merge(c, 1, Integer::sum);
            }
            for (Map.Entry<Character, Integer> entry : firstWordCharCounter.entrySet()) {
                Integer charCounter = wordCharCounter.get(entry.getKey());
                if (charCounter == null) {
                    entry.setValue(0);
                } else if (charCounter < entry.getValue()) {
                    entry.setValue(charCounter);
                }
            }
        }

        List<String> result = new ArrayList<>();
        firstWordCharCounter.forEach((k, v) -> {
            while (v > 0) {
                result.add(k + "");
                v--;
            }
        });
        return result;
    }
}
