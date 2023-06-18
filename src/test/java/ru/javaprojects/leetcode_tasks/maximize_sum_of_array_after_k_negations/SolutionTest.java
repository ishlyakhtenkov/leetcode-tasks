package ru.javaprojects.leetcode_tasks.maximize_sum_of_array_after_k_negations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void largestSumAfterKNegations() {
        Solution solution = new Solution();
        assertEquals(20, solution.largestSumAfterKNegations(new int[] {5,6,9,-3,3}, 2));
        assertEquals(6, solution.largestSumAfterKNegations(new int[] {3,-1,0,2}, 3));
        assertEquals(5, solution.largestSumAfterKNegations(new int[] {4,2,3}, 1));
        assertEquals(9, solution.largestSumAfterKNegations(new int[] {4,2,3}, 2));
        assertEquals(13, solution.largestSumAfterKNegations(new int[] {2,-3,-1,5,-4}, 2));
    }
}