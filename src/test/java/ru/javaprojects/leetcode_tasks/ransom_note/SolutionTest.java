package ru.javaprojects.leetcode_tasks.ransom_note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canConstructWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.canConstruct("aa", "aab"));
    }

    @Test
    void canConstructWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.canConstruct("a", "b"));
        assertFalse(solution.canConstruct("aa", "ab"));
    }
}