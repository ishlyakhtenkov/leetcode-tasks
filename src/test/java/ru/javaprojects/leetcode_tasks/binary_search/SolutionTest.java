package ru.javaprojects.leetcode_tasks.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        Solution solution = new Solution();
        assertEquals(4, solution.search(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, solution.search(new int[] {-1,0,3,5,9,12}, 2));
    }
}