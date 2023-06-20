package ru.javaprojects.leetcode_tasks.check_if_two_string_arrays_are_equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrayStringsAreEqualWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        assertTrue(solution.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

    @Test
    void arrayStringsAreEqualWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        assertFalse(solution.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddef"}));
    }
}