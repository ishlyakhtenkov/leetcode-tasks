package ru.javaprojects.leetcode_tasks.can_make_arithmetic_progression_from_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canMakeArithmeticProgressionWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.canMakeArithmeticProgression(new int[] {3,5,1}));
    }

    @Test
    void canMakeArithmeticProgressionWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.canMakeArithmeticProgression(new int[] {1,2,4}));
    }
}