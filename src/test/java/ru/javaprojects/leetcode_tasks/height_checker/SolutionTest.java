package ru.javaprojects.leetcode_tasks.height_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void heightChecker() {
        Solution solution = new Solution();
        assertEquals(3, solution.heightChecker(new int[] {1,1,4,2,1,3}));
        assertEquals(5, solution.heightChecker(new int[] {5,1,2,3,4}));
        assertEquals(0, solution.heightChecker(new int[] {1,2,3,4,5}));
    }
}