package ru.javaprojects.leetcode_tasks.add_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addStrings() {
        Solution solution = new Solution();
        assertEquals("134", solution.addStrings("11", "123"));
        assertEquals("533", solution.addStrings("456", "77"));
        assertEquals("0", solution.addStrings("0", "0"));
        assertEquals("1", solution.addStrings("0", "1"));
        assertEquals("110", solution.addStrings("55", "55"));
        assertEquals("120", solution.addStrings("55", "65"));
        assertEquals("198", solution.addStrings("99", "99"));
        assertEquals("10", solution.addStrings("0", "10"));
        assertEquals("108", solution.addStrings("9", "99"));
    }
}