package ru.javaprojects.leetcode_tasks.arranging_coins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrangeCoins() {
        Solution solution = new Solution();
        assertEquals(2, solution.arrangeCoins(5));
        assertEquals(3, solution.arrangeCoins(8));
        assertEquals(1, solution.arrangeCoins(1));
    }
}