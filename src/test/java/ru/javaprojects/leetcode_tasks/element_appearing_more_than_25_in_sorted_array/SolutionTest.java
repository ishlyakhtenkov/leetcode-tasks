package ru.javaprojects.leetcode_tasks.element_appearing_more_than_25_in_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findSpecialInteger() {
        Solution solution = new Solution();
        assertEquals(6, solution.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        assertEquals(1, solution.findSpecialInteger(new int[]{1, 1}));
    }
}