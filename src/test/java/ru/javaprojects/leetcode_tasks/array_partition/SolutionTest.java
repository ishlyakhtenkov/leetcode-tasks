package ru.javaprojects.leetcode_tasks.array_partition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrayPairSum() {
        Solution solution = new Solution();
        assertEquals(4, solution.arrayPairSum(new int[] {1,4,3,2}));
        assertEquals(9, solution.arrayPairSum(new int[] {6,2,6,5,1,2}));
    }
}