package ru.javaprojects.leetcode_tasks.missing_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void missingNumber() {
        Solution solution = new Solution();
        assertEquals(2, solution.missingNumber(new int[] {3, 0, 1}));
        assertEquals(2, solution.missingNumber(new int[] {0, 1}));
        assertEquals(0, solution.missingNumber(new int[] {1, 2}));
        assertEquals(8, solution.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}