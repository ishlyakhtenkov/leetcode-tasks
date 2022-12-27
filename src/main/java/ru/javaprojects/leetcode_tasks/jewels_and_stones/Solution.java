package ru.javaprojects.leetcode_tasks.jewels_and_stones;

import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsChars = jewels.toCharArray();
        HashSet<Character> jewelsSet = new HashSet<>();
        for (int i = 0; i < jewelsChars.length; i++) {
            jewelsSet.add(jewelsChars[i]);
        }
        int jewelCounter = 0;
        char[] stonesChars = stones.toCharArray();
        for (int i = 0; i < stonesChars.length; i++) {
            if (jewelsSet.contains(stonesChars[i])) {
                jewelCounter++;
            }
        }
        return jewelCounter;
    }
}
