package ru.javaprojects.leetcode_tasks.make_the_string_great;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void makeGood() {
        Solution solution = new Solution();
        assertEquals("leetcode", solution.makeGood("leEeetcode"));
        assertEquals("", solution.makeGood("abBAcC"));
    }
}