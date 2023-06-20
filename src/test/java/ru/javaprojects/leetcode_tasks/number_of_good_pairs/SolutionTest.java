package ru.javaprojects.leetcode_tasks.number_of_good_pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numIdenticalPairs() {
        Solution solution = new Solution();
        assertEquals(4, solution.numIdenticalPairs(new int[] {1,2,3,1,1,3}));
        assertEquals(6, solution.numIdenticalPairs(new int[] {1,1,1,1}));
        assertEquals(0, solution.numIdenticalPairs(new int[] {1,2,3}));
    }
}