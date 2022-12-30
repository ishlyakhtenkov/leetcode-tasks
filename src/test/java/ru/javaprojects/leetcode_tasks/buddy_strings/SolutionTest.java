package ru.javaprojects.leetcode_tasks.buddy_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void buddyStringsWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.buddyStrings("ab", "ba"));
        assertTrue(solution.buddyStrings("aa", "aa"));
        assertTrue(solution.buddyStrings("aaa", "aaa"));
        assertTrue(solution.buddyStrings("aaaa", "aaaa"));
        assertTrue(solution.buddyStrings("aabb", "aabb"));
        assertTrue(solution.buddyStrings("abb", "abb"));
        assertTrue(solution.buddyStrings("abca", "abca"));
    }

    @Test
    void buddyStringsWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.buddyStrings("ab", "ab"));
        assertFalse(solution.buddyStrings("abc", "abc"));
    }
}