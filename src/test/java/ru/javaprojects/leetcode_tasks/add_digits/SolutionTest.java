package ru.javaprojects.leetcode_tasks.add_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addDigits() {
        Solution solution = new Solution();
        assertEquals(2, solution.addDigits(38));
        assertEquals(0, solution.addDigits(0));
        assertEquals(1, solution.addDigits(10));
    }
}