package ru.javaprojects.leetcode_tasks.backspace_string_compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void backspaceCompareWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
        assertTrue(solution.backspaceCompare("ab##", "c#d#"));
        assertTrue(solution.backspaceCompare("bxj##tw", "bxo#j##tw"));
    }

    @Test
    void backspaceCompareWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.backspaceCompare("a#c", "b"));
    }
}