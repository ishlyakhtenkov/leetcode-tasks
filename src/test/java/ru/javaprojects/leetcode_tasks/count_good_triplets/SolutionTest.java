package ru.javaprojects.leetcode_tasks.count_good_triplets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countGoodTriplets() {
        Solution solution = new Solution();
        assertEquals(4, solution.countGoodTriplets(new int[] {3,0,1,1,9,7}, 7, 2, 3));
        assertEquals(0, solution.countGoodTriplets(new int[] {1,1,2,2,3}, 0, 0, 1));
    }
}