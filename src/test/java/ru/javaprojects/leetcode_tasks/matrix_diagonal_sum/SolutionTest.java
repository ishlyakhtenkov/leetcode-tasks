package ru.javaprojects.leetcode_tasks.matrix_diagonal_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diagonalSum() {
        Solution solution = new Solution();
        assertEquals(5, solution.diagonalSum(new int[][] {{5}}));
        assertEquals(25, solution.diagonalSum(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}}));
        assertEquals(8, solution.diagonalSum(new int[][] {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}}));
    }
}