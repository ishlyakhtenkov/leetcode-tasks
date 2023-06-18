package ru.javaprojects.leetcode_tasks.remove_all_adjacent_duplicates_in_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates() {
        Solution solution = new Solution();
        assertEquals("ca", solution.removeDuplicates("abbaca"));
        assertEquals("a", solution.removeDuplicates("cabbaca"));
        assertEquals("ay", solution.removeDuplicates("azxxzy"));
    }
}