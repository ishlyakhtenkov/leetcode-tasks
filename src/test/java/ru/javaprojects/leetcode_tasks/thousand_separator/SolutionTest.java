package ru.javaprojects.leetcode_tasks.thousand_separator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void thousandSeparator() {
        Solution solution = new Solution();
        assertEquals("1.234", solution.thousandSeparator(1234));
        assertEquals("987", solution.thousandSeparator(987));
        assertEquals("1.897.654", solution.thousandSeparator(1897654));
        assertEquals("100", solution.thousandSeparator(100));
        assertEquals("1", solution.thousandSeparator(1));
    }
}