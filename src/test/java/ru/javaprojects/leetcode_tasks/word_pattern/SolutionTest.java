package ru.javaprojects.leetcode_tasks.word_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void wordPatternWhenMatches() {
        Solution solution = new Solution();
        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void wordPatternWhenNotMatches() {
        Solution solution = new Solution();
        assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
        assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
        assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(solution.wordPattern("aaa", "dog cat cat dog"));
        assertFalse(solution.wordPattern("ab", "happy hacking"));
    }
}