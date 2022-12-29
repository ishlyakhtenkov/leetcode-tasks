package ru.javaprojects.leetcode_tasks.longest_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        Solution solution = new Solution();
        assertEquals(7, solution.longestPalindrome("abccccdd"));
        assertEquals(1, solution.longestPalindrome("a"));
        assertEquals(2, solution.longestPalindrome("aa"));
        assertEquals(1, solution.longestPalindrome("aA"));
        assertEquals(12, solution.longestPalindrome("aaaabbbbcccc"));
        assertEquals(13, solution.longestPalindrome("aaaabbzbbcccc"));
        assertEquals(13, solution.longestPalindrome("aaaabbzxbbcccc"));
    }
}