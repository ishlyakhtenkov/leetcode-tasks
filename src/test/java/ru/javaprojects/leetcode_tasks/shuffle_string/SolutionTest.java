package ru.javaprojects.leetcode_tasks.shuffle_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void restoreString() {
        Solution solution = new Solution();
        assertEquals("leetcode", solution.restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
        assertEquals("abc", solution.restoreString("abc", new int[] {0,1,2}));
    }
}