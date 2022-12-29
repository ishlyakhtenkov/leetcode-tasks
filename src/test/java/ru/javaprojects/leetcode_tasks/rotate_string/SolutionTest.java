package ru.javaprojects.leetcode_tasks.rotate_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rotateStringWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.rotateString("abcde", "cdeab"));
    }

    @Test
    void rotateStringWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.rotateString("abcde", "abced"));
        assertFalse(solution.rotateString("bcdea", "abced"));
        assertFalse(solution.rotateString("acdea", "abced"));
    }
}