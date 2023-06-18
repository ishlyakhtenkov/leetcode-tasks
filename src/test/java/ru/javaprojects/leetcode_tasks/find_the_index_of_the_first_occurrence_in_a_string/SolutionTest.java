package ru.javaprojects.leetcode_tasks.find_the_index_of_the_first_occurrence_in_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void strStr() {
        Solution solution = new Solution();
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    void strStrWhenNeedleNotPresent() {
        Solution solution = new Solution();
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
}
