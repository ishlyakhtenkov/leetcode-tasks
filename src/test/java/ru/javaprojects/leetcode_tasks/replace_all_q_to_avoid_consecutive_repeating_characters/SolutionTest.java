package ru.javaprojects.leetcode_tasks.replace_all_q_to_avoid_consecutive_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void modifyString() {
        Solution solution = new Solution();
        assertEquals("azs", solution.modifyString("?zs"));
        assertEquals("ubvaw", solution.modifyString("ubv?w"));
        assertEquals("ubvw", solution.modifyString("ubvw"));
        assertEquals("a", solution.modifyString("a"));
        assertEquals("ababa", solution.modifyString("?????"));
        assertEquals("a", solution.modifyString("?"));
        assertEquals("ababca", solution.modifyString("?????a"));
    }
}