package ru.javaprojects.leetcode_tasks.count_negative_numbers_in_a_sorted_matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countNegatives() {
        Solution solution = new Solution();
        assertEquals(8, solution.countNegatives(new int[][]{{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}}));
        assertEquals(0, solution.countNegatives(new int[][]{{3, 2}, {1, 0}}));
    }
}