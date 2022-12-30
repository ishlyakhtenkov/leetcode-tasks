package ru.javaprojects.leetcode_tasks.lemonade_change;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lemonadeChangeWhenHasChange() {
        Solution solution = new Solution();
        assertTrue(solution.lemonadeChange(new int[] {5,5,5,10,20}));
    }

    @Test
    void lemonadeChangeWhenHasNotChange() {
        Solution solution = new Solution();
        assertFalse(solution.lemonadeChange(new int[] {5,5,10,10,20}));
    }
}