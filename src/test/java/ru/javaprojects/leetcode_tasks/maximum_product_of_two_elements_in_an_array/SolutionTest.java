package ru.javaprojects.leetcode_tasks.maximum_product_of_two_elements_in_an_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProduct() {
        Solution solution = new Solution();
        assertEquals(12, solution.maxProduct(new int[] {3,4,5,2}));
        assertEquals(16, solution.maxProduct(new int[] {1,5,4,5}));
        assertEquals(12, solution.maxProduct(new int[] {3,7}));
        assertEquals(0, solution.maxProduct(new int[] {3,1,1}));
        assertEquals(36, solution.maxProduct(new int[] {10,2,5,2}));
        assertEquals(36, solution.maxProduct(new int[] {2,5,2,10}));
        assertEquals(36, solution.maxProduct(new int[] {2,2,5,10}));
        assertEquals(36, solution.maxProduct(new int[] {2,2,10,5}));
    }
}