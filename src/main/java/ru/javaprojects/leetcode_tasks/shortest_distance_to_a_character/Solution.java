package ru.javaprojects.leetcode_tasks.shortest_distance_to_a_character;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                indexes.add(i);
            }
        }
        int[] result = new int[s.length()];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != c) {
                int closestIndex = indexes.get(0);
                for (int index : indexes) {
                    if (Math.abs(index - i) <= Math.abs(closestIndex - i)) {
                        closestIndex = index;
                    } else {
                        break;
                    }
                }
                result[i] = Math.abs(closestIndex - i);
            }
        }
        return result;
    }
}
