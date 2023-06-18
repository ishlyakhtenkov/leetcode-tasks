package ru.javaprojects.leetcode_tasks.complement_of_base_10_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void bitwiseComplement() {
        Solution solution = new Solution();
        assertEquals(2, solution.bitwiseComplement(5));
        assertEquals(0, solution.bitwiseComplement(7));
        assertEquals(5, solution.bitwiseComplement(10));
    }
}