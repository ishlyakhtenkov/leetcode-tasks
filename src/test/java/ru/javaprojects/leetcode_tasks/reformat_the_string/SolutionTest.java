package ru.javaprojects.leetcode_tasks.reformat_the_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reformat() {
        Solution solution = new Solution();
        assertEquals("0a1b2c", solution.reformat("a0b1c2"));
        assertEquals("a0b1c2d", solution.reformat("abcd012"));
        assertEquals("", solution.reformat("leetcode"));
        assertEquals("", solution.reformat("1229857369"));
    }
}