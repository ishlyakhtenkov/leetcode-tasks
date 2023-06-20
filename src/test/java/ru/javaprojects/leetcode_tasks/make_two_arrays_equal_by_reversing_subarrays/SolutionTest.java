package ru.javaprojects.leetcode_tasks.make_two_arrays_equal_by_reversing_subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canBeEqualWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.canBeEqual(new int[] {1,2,3,4}, new int[] {2,4,1,3}));
        assertTrue(solution.canBeEqual(new int[] {7}, new int[] {7}));
    }

    @Test
    void canBeEqualWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.canBeEqual(new int[] {3,7,9}, new int[] {3,7,11}));
    }
}