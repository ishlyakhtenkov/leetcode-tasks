package ru.javaprojects.leetcode_tasks.duplicate_zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void duplicateZeros() {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
        arr = new int[]{1, 2, 3};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }
}