package ru.javaprojects.leetcode_tasks.verifying_an_alien_dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAlienSortedWhenSorted() {
        Solution solution = new Solution();
        assertTrue(solution.isAlienSorted(new String[] {"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    void isAlienSortedWhenNotSorted() {
        Solution solution = new Solution();
        assertFalse(solution.isAlienSorted(new String[] {"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
        assertFalse(solution.isAlienSorted(new String[] {"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
    }
}