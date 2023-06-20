package ru.javaprojects.leetcode_tasks.minimum_changes_to_make_alternating_binary_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minOperations() {
        Solution solution = new Solution();
        assertEquals(1, solution.minOperations("0100"));
        assertEquals(0, solution.minOperations("10"));
        assertEquals(1, solution.minOperations("111"));
        assertEquals(1, solution.minOperations("11"));
        assertEquals(2, solution.minOperations("1111"));
        assertEquals(2, solution.minOperations("111101"));
        assertEquals(2, solution.minOperations("111110"));
        assertEquals(4, solution.minOperations("01111110"));
        assertEquals(3, solution.minOperations("10010100"));
    }
}