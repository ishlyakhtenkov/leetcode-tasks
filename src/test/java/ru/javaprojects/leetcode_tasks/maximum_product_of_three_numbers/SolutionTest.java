package ru.javaprojects.leetcode_tasks.maximum_product_of_three_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maximumProduct() {
        Solution solution = new Solution();
        assertEquals(6, solution.maximumProduct(new int[] {1,2,3}));
        assertEquals(24, solution.maximumProduct(new int[] {1,2,3,4}));
        assertEquals(-6, solution.maximumProduct(new int[] {-1,-2,-3}));
        assertEquals(12, solution.maximumProduct(new int[] {-3,-2,-1, 1, 2}));
    }
}