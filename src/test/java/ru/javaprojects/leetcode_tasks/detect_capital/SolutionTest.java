package ru.javaprojects.leetcode_tasks.detect_capital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void detectCapitalUseWhenCorrectUse() {
        Solution solution = new Solution();
        assertTrue(solution.detectCapitalUse("USA"));
        assertTrue(solution.detectCapitalUse("Google"));
    }

    @Test
    void detectCapitalUseWhenIncorrectUse() {
        Solution solution = new Solution();
        assertFalse(solution.detectCapitalUse("FlaG"));
        assertFalse(solution.detectCapitalUse("FLaG"));
    }
}