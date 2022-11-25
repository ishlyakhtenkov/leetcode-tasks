package ru.javaprojects.leetcode_tasks.contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void containsDuplicateWhenContains() {
        Solution solution = new Solution();
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertTrue(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    void containsDuplicateWhenNotContains() {
        Solution solution = new Solution();
        assertFalse(solution.containsDuplicate(new int[]{1,2,3,4}));
    }
}