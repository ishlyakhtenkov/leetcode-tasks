package ru.javaprojects.leetcode_tasks.move_zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void moveZeroes() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[] {1,3,12,0,0}, nums);

        nums = new int[]{0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[] {0}, nums);
    }
}