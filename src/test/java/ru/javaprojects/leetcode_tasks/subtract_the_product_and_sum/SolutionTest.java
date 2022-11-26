package ru.javaprojects.leetcode_tasks.subtract_the_product_and_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void subtractProductAndSum() {
        Solution solution = new Solution();
        assertEquals(15, solution.subtractProductAndSum(234));
        assertEquals(21, solution.subtractProductAndSum(4421));
    }
}