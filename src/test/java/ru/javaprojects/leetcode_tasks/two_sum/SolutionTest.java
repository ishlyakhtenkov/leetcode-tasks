package ru.javaprojects.leetcode_tasks.two_sum;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testTwoSum() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {1, 2}, solution.twoSum(new int[] {3,2,4}, 6));
        assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {3,3}, 6));
    }
}