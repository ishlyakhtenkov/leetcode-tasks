package ru.javaprojects.leetcode_tasks.circular_sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isCircularSentenceWhenCircular() {
        Solution solution = new Solution();
        assertTrue(solution.isCircularSentence("leetcode exercises sound delightful"));
        assertTrue(solution.isCircularSentence("eetcode"));
    }

    @Test
    void isCircularSentenceWhenNotCircular() {
        Solution solution = new Solution();
        assertFalse(solution.isCircularSentence("Leetcode is cool"));
    }
}