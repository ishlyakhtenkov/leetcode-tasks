package ru.javaprojects.leetcode_tasks.maximum_number_of_balloons;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : text.toCharArray()) {
            charCounter.merge(c, 1, Integer::sum);
        }
        int maxNumber = Integer.MAX_VALUE;
        for (char c : "balloon".toCharArray()) {
            int maxNumberByChar = calcMaxNumberByChar(c, charCounter);
            if (maxNumberByChar == 0) {
                return 0;
            } else if (maxNumberByChar < maxNumber) {
                maxNumber = maxNumberByChar;
            }
        }
        return maxNumber;
    }

    private int calcMaxNumberByChar(char c, Map<Character, Integer> charCounter) {
        Integer counter = charCounter.get(c);
        if (counter == null) {
            return 0;
        }
        return (c == 'l' || c == 'o') ? counter / 2 : counter;
    }
}