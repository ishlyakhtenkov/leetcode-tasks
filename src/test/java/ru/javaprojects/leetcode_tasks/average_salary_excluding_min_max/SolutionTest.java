package ru.javaprojects.leetcode_tasks.average_salary_excluding_min_max;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void average() {
        Solution solution = new Solution();
        assertEquals(2500d, solution.average(new int[] {4000,3000,1000,2000}));
        assertEquals(2000d, solution.average(new int[] {1000,2000,3000}));
    }
}