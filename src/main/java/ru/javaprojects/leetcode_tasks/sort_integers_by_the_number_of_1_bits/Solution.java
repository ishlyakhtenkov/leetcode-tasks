package ru.javaprojects.leetcode_tasks.sort_integers_by_the_number_of_1_bits;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((i1, i2) -> {
                    int i1BitCount = Integer.bitCount(i1);
                    int i2BitCount = Integer.bitCount(i2);
                    if (i1BitCount == i2BitCount) {
                        return Integer.compare(i1, i2);
                    } else {
                        return Integer.compare(i1BitCount, i2BitCount);
                    }
                })
                .mapToInt(i -> i)
                .toArray();
    }
}
