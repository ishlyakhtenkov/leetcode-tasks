package ru.javaprojects.leetcode_tasks.search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchInsert() {
        Solution solution = new Solution();
        assertEquals(2, solution.searchInsert(new int[] {1,3,5,6}, 5));
        assertEquals(1, solution.searchInsert(new int[] {1,3,5,6}, 2));
        assertEquals(4, solution.searchInsert(new int[] {1,3,5,6}, 7));
        assertEquals(1, solution.searchInsert(new int[] {-1,3,5,6}, 0));
        assertEquals(0, solution.searchInsert(new int[] {0,1,3,5,6}, 0));
        assertEquals(0, solution.searchInsert(new int[] {1,3,5,6}, 0));
        assertEquals(1, solution.searchInsert(new int[] {1,3}, 2));
        assertEquals(0, solution.searchInsert(new int[] {1,3}, 1));
        assertEquals(0, solution.searchInsert(new int[] {1,3}, 0));
    }
}