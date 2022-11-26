package ru.javaprojects.leetcode_tasks.isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mappings = new HashMap<>();
        Map<Character, Character> reverseMappings = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            Character mapping = mappings.get(sChars[i]);
            Character reverseMapping = reverseMappings.get(tChars[i]);

            if (mapping != null) {
                if (mapping != tChars[i]) {
                    return false;
                }
            } else {
                mappings.put(sChars[i], tChars[i]);
            }

            if (reverseMapping != null) {
                if (reverseMapping != sChars[i]) {
                    return false;
                }
            } else {
                reverseMappings.put(tChars[i], sChars[i]);
            }

        }
        return true;
    }
}
