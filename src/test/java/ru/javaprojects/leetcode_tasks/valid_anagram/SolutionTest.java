package ru.javaprojects.leetcode_tasks.valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagramWhenAnagram() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagramWhenNotAnagram() {
        Solution solution = new Solution();
        assertFalse(solution.isAnagram("rat", "car"));
    }
}