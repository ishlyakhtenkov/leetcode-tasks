package ru.javaprojects.leetcode_tasks.robot_return_to_origin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void judgeCircleWhenReturnsToOrigin() {
        Solution solution = new Solution();
        assertTrue(solution.judgeCircle("UD"));
    }

    @Test
    void judgeCircleWhenNotReturnsToOrigin() {
        Solution solution = new Solution();
        assertFalse(solution.judgeCircle("LL"));
    }
}