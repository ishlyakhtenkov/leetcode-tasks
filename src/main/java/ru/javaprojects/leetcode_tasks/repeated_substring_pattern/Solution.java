package ru.javaprojects.leetcode_tasks.repeated_substring_pattern;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char sequenceStartChar = s.charAt(0);
        String sequence = null;
        boolean isSequence = false;
        for (int i = 1; i < s.length(); ) {
            if (s.charAt(i) == sequenceStartChar) {
                if (sequence == null) {
                    sequence = s.substring(0, i);
                }
                if (i + sequence.length() > s.length()) {
                    return false;
                }
                isSequence = true;
                for (int j = 1; j < sequence.length(); j++) {
                    if (sequence.charAt(j) != s.charAt(i + j)) {
                        sequence = null;
                        i++;
                        isSequence = false;
                        break;
                    }
                }
                if (isSequence) {
                    i += sequence.length();
                }
            } else if (sequence != null && sequence.length() == 1) {
                sequence = null;
                i++;
            } else if (isSequence) {
                sequence = null;
                isSequence = false;
                i--;
            } else {
                i++;
            }
        }
        return sequence != null;
    }
}
