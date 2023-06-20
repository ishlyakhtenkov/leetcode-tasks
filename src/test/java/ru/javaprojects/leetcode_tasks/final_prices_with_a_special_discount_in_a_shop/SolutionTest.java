package ru.javaprojects.leetcode_tasks.final_prices_with_a_special_discount_in_a_shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void finalPrices() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {4,2,4,2,3}, solution.finalPrices(new int[] {8,4,6,2,3}));
        assertArrayEquals(new int[] {1,2,3,4,5}, solution.finalPrices(new int[] {1,2,3,4,5}));
        assertArrayEquals(new int[] {9,0,1,6}, solution.finalPrices(new int[] {10,1,1,6}));
    }
}