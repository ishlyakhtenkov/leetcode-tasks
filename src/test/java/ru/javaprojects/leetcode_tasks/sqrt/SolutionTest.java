package ru.javaprojects.leetcode_tasks.sqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mySqrt() {
        Solution solution = new Solution();
        assertEquals(2, solution.mySqrt(4));
        assertEquals(2, solution.mySqrt(8));
        assertEquals(1, solution.mySqrt(1));
        assertEquals(46340, solution.mySqrt(2147395600));
    }
}