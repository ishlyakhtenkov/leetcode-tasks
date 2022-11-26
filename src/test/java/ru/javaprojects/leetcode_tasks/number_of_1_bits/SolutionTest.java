package ru.javaprojects.leetcode_tasks.number_of_1_bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hammingWeight() {
        Solution solution = new Solution();
        assertEquals(3, solution.hammingWeight(521));
        assertEquals(1, solution.hammingWeight(2097152));
    }
}