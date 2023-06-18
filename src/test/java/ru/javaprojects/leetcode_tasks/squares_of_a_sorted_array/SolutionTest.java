package ru.javaprojects.leetcode_tasks.squares_of_a_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortedSquares() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0,1,9,16,100}, solution.sortedSquares(new int[] {-4,-1,0,3,10}));
        assertArrayEquals(new int[] {4,9,9,49,121}, solution.sortedSquares(new int[] {-7,-3,2,3,11}));
        assertArrayEquals(new int[] {1, 9, 49}, solution.sortedSquares(new int[] {-7,-3,-1}));
        assertArrayEquals(new int[] {1, 4, 9}, solution.sortedSquares(new int[] {1, 2, 3}));
    }
}