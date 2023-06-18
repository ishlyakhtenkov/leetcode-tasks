package ru.javaprojects.leetcode_tasks.detect_pattern_of_length_m_repeated_k_or_more_times;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void containsPatternWhenContains() {
        Solution solution = new Solution();
        assertTrue(solution.containsPattern(new int[] {1,2,1,2,1,1,1,3}, 2, 2));
        assertTrue(solution.containsPattern(new int[] {1,2,1,2,1,2,1,3}, 2, 3));
        assertTrue(solution.containsPattern(new int[] {1,2,1,2,1,3,1,3,1,3}, 2, 3));
        assertTrue(solution.containsPattern(new int[] {1,2,1,2,1,2}, 2, 3));
        assertTrue(solution.containsPattern(new int[] {1,2,4,4,4,4}, 1, 3));
        assertTrue(solution.containsPattern(new int[] {3,1,2,1,2,1,1,1,3}, 2, 2));
        assertTrue(solution.containsPattern(new int[] {3,3,1,2,1,2,1,1,1,3}, 2, 2));
        assertTrue(solution.containsPattern(new int[] {3,5,3,3,1,2,1,1,1,1}, 2, 2));
    }

    @Test
    void containsPatternWhenNotContains() {
        Solution solution = new Solution();
        assertFalse(solution.containsPattern(new int[] {1,2,1,2,1,3}, 2, 3));
    }
}