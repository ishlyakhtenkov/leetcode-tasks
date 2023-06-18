package ru.javaprojects.leetcode_tasks.find_n_unique_integers_sum_up_to_zero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sumZero() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1, -1, 2, -2, 0}, solution.sumZero(5));
        assertArrayEquals(new int[] {1, -1, 0}, solution.sumZero(3));
        assertArrayEquals(new int[] {0}, solution.sumZero(1));
    }
}