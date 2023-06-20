package ru.javaprojects.leetcode_tasks.day_of_the_week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void dayOfTheWeek() {
        Solution solution = new Solution();
        assertEquals("Saturday", solution.dayOfTheWeek(31, 8, 2019));
        assertEquals("Sunday", solution.dayOfTheWeek(18, 7, 1999));
        assertEquals("Sunday", solution.dayOfTheWeek(15, 8, 1993));
    }
}