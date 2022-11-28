package ru.javaprojects.leetcode_tasks.largest_perimeter_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void largestPerimeter() {
        Solution solution = new Solution();
        assertEquals(5, solution.largestPerimeter(new int[] {2,1,2}));
        assertEquals(0, solution.largestPerimeter(new int[] {1,2,1}));
        assertEquals(10, solution.largestPerimeter(new int[] {3,2,3,4}));
    }
}