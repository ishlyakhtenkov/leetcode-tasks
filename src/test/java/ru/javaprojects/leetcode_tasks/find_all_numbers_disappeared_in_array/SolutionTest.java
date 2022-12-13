package ru.javaprojects.leetcode_tasks.find_all_numbers_disappeared_in_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDisappearedNumbers() {
        Solution solution = new Solution();
        assertEquals(List.of(5, 6), solution.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
        assertEquals(List.of(2), solution.findDisappearedNumbers(new int[] {1, 1}));
    }
}