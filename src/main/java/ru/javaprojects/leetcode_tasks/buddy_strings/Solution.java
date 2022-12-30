package ru.javaprojects.leetcode_tasks.buddy_strings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // a f b n g d r
    // a n b f g d r

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Map<Character, Integer> charCounter = new HashMap<>();
            char[] sChars = s.toCharArray();
            for (char sChar : sChars) {
                Integer counter = charCounter.merge(sChar, 1, Integer::sum);
                if (counter > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int firstDifferentLetterIndex = -1;
            int secondDifferentLetterIndex = -1;
            int differentLetterCounter = 0;

            char[] sChars = s.toCharArray();
            char[] goalChars = goal.toCharArray();

            for (int i = 0; i < sChars.length; i++) {
                if (sChars[i] != goalChars[i]) {
                    if (differentLetterCounter == 0) {
                        firstDifferentLetterIndex = i;
                        differentLetterCounter++;
                    } else if (differentLetterCounter == 1) {
                        secondDifferentLetterIndex = i;
                        differentLetterCounter++;
                    } else {
                        return false;
                    }
                }
            }
            return (differentLetterCounter != 1 &&
                            sChars[firstDifferentLetterIndex] == goalChars[secondDifferentLetterIndex] &&
                            sChars[secondDifferentLetterIndex] == goalChars[firstDifferentLetterIndex]);
        }
    }
}