package ru.javaprojects.leetcode_tasks.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindromeWhenPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindrome(" "));
    }

    @Test
    void isPalindromeWhenNotPalindrome() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome("race a car"));
    }
}