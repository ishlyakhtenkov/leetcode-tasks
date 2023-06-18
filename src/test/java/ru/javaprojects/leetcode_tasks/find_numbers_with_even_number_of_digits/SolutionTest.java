package ru.javaprojects.leetcode_tasks.find_numbers_with_even_number_of_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNumbers() {
        Solution solution = new Solution();
        assertEquals(2, solution.findNumbers(new int[]{12, 345, 2, 6, 7896}));
        assertEquals(1, solution.findNumbers(new int[]{555, 901, 482, 1771}));
    }
}