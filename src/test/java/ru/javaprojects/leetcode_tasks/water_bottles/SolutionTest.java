package ru.javaprojects.leetcode_tasks.water_bottles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numWaterBottles() {
        Solution solution = new Solution();
        assertEquals(13, solution.numWaterBottles(9, 3));
        assertEquals(19, solution.numWaterBottles(15, 4));
    }
}