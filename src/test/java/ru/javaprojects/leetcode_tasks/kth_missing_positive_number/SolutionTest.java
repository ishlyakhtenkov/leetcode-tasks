package ru.javaprojects.leetcode_tasks.kth_missing_positive_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findKthPositive() {
        Solution solution = new Solution();
        assertEquals(9, solution.findKthPositive(new int[] {2,3,4,7,11}, 5));
        assertEquals(6, solution.findKthPositive(new int[] {1,2,3,4}, 2));
    }
}