package ru.javaprojects.leetcode_tasks.excel_sheet_column_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void titleToNumber() {
        Solution solution = new Solution();
        assertEquals(1, solution.titleToNumber("A"));
        assertEquals(28, solution.titleToNumber("AB"));
        assertEquals(701, solution.titleToNumber("ZY"));
        assertEquals(702, solution.titleToNumber("ZZ"));
        assertEquals(703, solution.titleToNumber("AAA"));
        assertEquals(2147483647, solution.titleToNumber("FXSHRXW"));
    }
}