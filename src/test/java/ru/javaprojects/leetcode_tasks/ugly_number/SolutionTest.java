package ru.javaprojects.leetcode_tasks.ugly_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isUglyWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.isUgly(6));
        assertTrue(solution.isUgly(1));
    }

    @Test
    void isUglyWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.isUgly(14));
    }
}