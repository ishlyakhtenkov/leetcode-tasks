package ru.javaprojects.leetcode_tasks.distribute_candies_to_people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void distributeCandies() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1, 2, 3, 1}, solution.distributeCandies(7, 4));
        assertArrayEquals(new int[] {5, 2, 3}, solution.distributeCandies(10, 3));
    }
}