package ru.javaprojects.leetcode_tasks.palindrome_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindromeWhenPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(121));
        assertTrue(solution.isPalindrome(11));
    }

    @Test
    void isPalindromeWhenNotPalindrome() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome(-121));
        assertFalse(solution.isPalindrome(10));
    }
}