package ru.javaprojects.leetcode_tasks.unique_number_of_occurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniqueOccurrencesWhenUnique() {
        Solution solution = new Solution();
        assertTrue(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertTrue(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }

    @Test
    void uniqueOccurrencesWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.uniqueOccurrences(new int[]{1, 2}));
    }
}