package ru.javaprojects.leetcode_tasks.path_crossing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPathCrossingWhenCrossing() {
        Solution solution = new Solution();
        assertTrue(solution.isPathCrossing("NESWW"));
    }

    @Test
    void isPathCrossingWhenNotCrossing() {
        Solution solution = new Solution();
        assertFalse(solution.isPathCrossing("NES"));
        assertFalse(solution.isPathCrossing("S"));
        assertFalse(solution.isPathCrossing("SS"));
    }
}