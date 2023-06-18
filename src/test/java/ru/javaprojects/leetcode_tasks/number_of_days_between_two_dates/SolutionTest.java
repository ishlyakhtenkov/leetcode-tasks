package ru.javaprojects.leetcode_tasks.number_of_days_between_two_dates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void daysBetweenDates() {
        Solution solution = new Solution();
        assertEquals(1, solution.daysBetweenDates("2019-06-29", "2019-06-30"));
        assertEquals(15, solution.daysBetweenDates("2020-01-15", "2019-12-31"));
    }
}