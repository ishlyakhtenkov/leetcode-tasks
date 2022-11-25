package ru.javaprojects.leetcode_tasks.longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        Solution solution = new Solution();
        assertEquals("fl", solution.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[] {"dog","racecar","car"}));
        assertEquals("a", solution.longestCommonPrefix(new String[] {"a"}));
    }
}