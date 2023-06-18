package ru.javaprojects.leetcode_tasks.how_many_numbers_are_smaller_than_the_current_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void smallerNumbersThanCurrent() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {4,0,1,1,3}, solution.smallerNumbersThanCurrent(new int[] {8,1,2,2,3}));
        assertArrayEquals(new int[] {2,1,0,3}, solution.smallerNumbersThanCurrent(new int[] {6,5,4,8}));
        assertArrayEquals(new int[] {0,0,0,0}, solution.smallerNumbersThanCurrent(new int[] {7,7,7,7}));
    }
}