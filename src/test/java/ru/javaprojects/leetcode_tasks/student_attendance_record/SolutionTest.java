package ru.javaprojects.leetcode_tasks.student_attendance_record;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkRecordWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.checkRecord("PPALLP"));
        assertTrue(solution.checkRecord("PPALLPL"));
        assertTrue(solution.checkRecord("LALL"));
    }

    @Test
    void checkRecordWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.checkRecord("PPALLL"));
        assertFalse(solution.checkRecord("PPALLA"));
    }
}