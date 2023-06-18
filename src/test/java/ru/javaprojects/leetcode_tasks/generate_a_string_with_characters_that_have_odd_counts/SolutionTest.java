package ru.javaprojects.leetcode_tasks.generate_a_string_with_characters_that_have_odd_counts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generateTheString() {
        Solution solution = new Solution();
        assertEquals("aaab", solution.generateTheString(4));
        assertEquals("ab", solution.generateTheString(2));
        assertEquals("aaaaabc", solution.generateTheString(7));
        assertEquals("a", solution.generateTheString(1));
        assertEquals("abc", solution.generateTheString(3));
    }
}