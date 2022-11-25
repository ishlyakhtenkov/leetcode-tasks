package ru.javaprojects.leetcode_tasks.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValidWhenValidParentheses() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertTrue(solution.isValid("([({})])"));
    }

    @Test
    void isValidWhenNotValidParentheses() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("({)"));
        assertFalse(solution.isValid("([({})[)"));
    }
}