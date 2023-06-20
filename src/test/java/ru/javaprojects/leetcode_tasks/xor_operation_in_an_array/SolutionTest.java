package ru.javaprojects.leetcode_tasks.xor_operation_in_an_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void xorOperation() {
        Solution solution = new Solution();
        assertEquals(8, solution.xorOperation(5, 0));
        assertEquals(8, solution.xorOperation(4, 3));
    }
}