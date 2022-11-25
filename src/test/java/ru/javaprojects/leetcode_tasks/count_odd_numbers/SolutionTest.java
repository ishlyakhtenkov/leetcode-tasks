package ru.javaprojects.leetcode_tasks.count_odd_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countOdds() {
        Solution solution = new Solution();
        assertEquals(3, solution.countOdds(3, 7));
        assertEquals(1, solution.countOdds(8, 10));
        assertEquals(1, solution.countOdds(1, 2));
        assertEquals(2, solution.countOdds(1, 3));
        assertEquals(3, solution.countOdds(1, 5));
        assertEquals(3, solution.countOdds(1, 6));
        assertEquals(4, solution.countOdds(1, 7));
        assertEquals(4, solution.countOdds(2, 10));
        assertEquals(6, solution.countOdds(1, 12));
        assertEquals(6, solution.countOdds(2, 14));
    }
}