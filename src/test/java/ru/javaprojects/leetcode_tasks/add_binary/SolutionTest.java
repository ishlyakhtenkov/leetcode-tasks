package ru.javaprojects.leetcode_tasks.add_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addBinary() {
        Solution solution = new Solution();
        assertEquals("100", solution.addBinary("11", "1"));
        assertEquals("10101", solution.addBinary("1010", "1011"));
        assertEquals("11110", solution.addBinary("1111", "1111"));
    }
}