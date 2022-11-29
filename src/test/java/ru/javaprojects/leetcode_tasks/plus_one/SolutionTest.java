package ru.javaprojects.leetcode_tasks.plus_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void plusOne() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1,2,4}, solution.plusOne(new int[] {1,2,3}));
        assertArrayEquals(new int[] {4,3,2,2}, solution.plusOne(new int[] {4,3,2,1}));
        assertArrayEquals(new int[] {1, 0}, solution.plusOne(new int[] {9}));
        assertArrayEquals(new int[] {1, 0, 0, 0}, solution.plusOne(new int[] {9,9,9}));
        assertArrayEquals(new int[] {9, 0, 0}, solution.plusOne(new int[] {8,9,9}));
        assertArrayEquals(new int[] {9, 9, 0}, solution.plusOne(new int[] {9,8,9}));
    }
}