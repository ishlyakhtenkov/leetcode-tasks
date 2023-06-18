package ru.javaprojects.leetcode_tasks.lucky_numbers_in_a_matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void luckyNumbers() {
        Solution solution = new Solution();
        assertEquals(List.of(15), solution.luckyNumbers(new int[][] {{3,7,8}, {9,11,13}, {15,16,17}}));
        assertEquals(List.of(12), solution.luckyNumbers(new int[][] {{1,10,4,2}, {9,3,8,7}, {15,16,17,12}}));
        assertEquals(List.of(7), solution.luckyNumbers(new int[][] {{7,8}, {1, 2}}));
    }
}