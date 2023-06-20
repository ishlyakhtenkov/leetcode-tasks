package ru.javaprojects.leetcode_tasks.reformat_date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reformatDate() {
        Solution solution = new Solution();
        assertEquals("2052-10-20", solution.reformatDate("20th Oct 2052"));
        assertEquals("1933-06-06", solution.reformatDate("6th Jun 1933"));
    }
}