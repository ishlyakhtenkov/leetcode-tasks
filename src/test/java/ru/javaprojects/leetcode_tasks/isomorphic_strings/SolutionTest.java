package ru.javaprojects.leetcode_tasks.isomorphic_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isIsomorphicWhenIsomorphic() {
        Solution solution = new Solution();
        assertTrue(solution.isIsomorphic("egg", "add"));
        assertTrue(solution.isIsomorphic("paper", "title"));
    }

    @Test
    void isIsomorphicWhenNotIsomorphic() {
        Solution solution = new Solution();
        assertFalse(solution.isIsomorphic("foo", "bar"));
        assertFalse(solution.isIsomorphic("badc", "baba"));
    }
}