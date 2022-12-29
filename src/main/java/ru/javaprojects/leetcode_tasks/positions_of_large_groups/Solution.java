package ru.javaprojects.leetcode_tasks.positions_of_large_groups;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> groups = new ArrayList<>();
        char[] chars = s.toCharArray();

        int charSeqCounter = 1;
        int charSeqStartIndex = 0;
        int previousChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == previousChar) {
                charSeqCounter++;
            } else {
                if (charSeqCounter >= 3) {
                    groups.add(List.of(charSeqStartIndex, i - 1));
                }
                charSeqCounter = 1;
                charSeqStartIndex = i;
                previousChar = chars[i];
            }
        }
        if (charSeqCounter >= 3) {
            groups.add(List.of(charSeqStartIndex, chars.length - 1));
        }

        return groups;
    }
}