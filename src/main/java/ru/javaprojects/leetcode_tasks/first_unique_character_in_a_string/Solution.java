package ru.javaprojects.leetcode_tasks.first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charCounter = new HashMap();
        for (int i = 0; i < chars.length; i++) {
            charCounter.merge(chars[i], 1, Integer::sum);
        }
        for (int i = 0; i < chars.length; i++) {
            if (charCounter.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}