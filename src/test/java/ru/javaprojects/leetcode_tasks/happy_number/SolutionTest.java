package ru.javaprojects.leetcode_tasks.happy_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isHappyWhenHappy() {
        Solution solution = new Solution();
        assertTrue(solution.isHappy(19));
        assertTrue(solution.isHappy(1));
    }

    @Test
    void isHappyWhenNotHappy() {
        Solution solution = new Solution();
        assertFalse(solution.isHappy(2));
    }
}