package ru.javaprojects.leetcode_tasks.fair_candy_swap;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> aliceBoxSizeSet = new HashSet<>();
        Set<Integer> bobBoxSizeSet = new HashSet<>();
        int aliceCandiesTotal = 0;
        int bobCandiesTotal = 0;
        for (int aliceSize : aliceSizes) {
            aliceCandiesTotal += aliceSize;
            aliceBoxSizeSet.add(aliceSize);
        }
        for (int bobSize : bobSizes) {
            bobCandiesTotal += bobSize;
            bobBoxSizeSet.add(bobSize);
        }
        int candiesAverage = (aliceCandiesTotal + bobCandiesTotal) / 2;

        int candiesNeeded = candiesAverage - (Math.min(aliceCandiesTotal, bobCandiesTotal));

        int[] exchangeBoxes = new int[2];

        if (aliceCandiesTotal < bobCandiesTotal) {
            for (int aliceBoxSize : aliceSizes) {
                if (bobBoxSizeSet.contains(aliceBoxSize + candiesNeeded)) {
                    exchangeBoxes[0] = aliceBoxSize;
                    exchangeBoxes[1] = aliceBoxSize + candiesNeeded;
                    return exchangeBoxes;
                }
            }
        } else {
            for (int bobBoxSize : bobSizes) {
                if (aliceBoxSizeSet.contains(bobBoxSize + candiesNeeded)) {
                    exchangeBoxes[0] = bobBoxSize + candiesNeeded;
                    exchangeBoxes[1] = bobBoxSize;
                    return exchangeBoxes;
                }
            }
        }
        return exchangeBoxes;
    }
}