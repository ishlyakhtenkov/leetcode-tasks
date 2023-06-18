package ru.javaprojects.leetcode_tasks.n_repeated_element_in_size_2n_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void repeatedNTimes() {
        Solution solution = new Solution();
        assertEquals(3, solution.repeatedNTimes(new int[] {1, 2, 3, 3}));
        assertEquals(2, solution.repeatedNTimes(new int[] {2,1,2,5,3,2}));
        assertEquals(5, solution.repeatedNTimes(new int[] {5,1,5,2,5,3,5,4}));
    }
}