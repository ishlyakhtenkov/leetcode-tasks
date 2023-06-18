package ru.javaprojects.leetcode_tasks.split_a_string_in_balanced_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void balancedStringSplit() {
        Solution solution = new Solution();
        assertEquals(4, solution.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(2, solution.balancedStringSplit("RLRRRLLRLL"));
        assertEquals(1, solution.balancedStringSplit("LLLLRRRR"));
    }
}