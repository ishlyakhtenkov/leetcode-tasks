package ru.javaprojects.leetcode_tasks.day_of_the_year;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void dayOfYear() {
        Solution solution = new Solution();
        assertEquals(9, solution.dayOfYear("2019-01-09"));
        assertEquals(41, solution.dayOfYear("2019-02-10"));
    }
}