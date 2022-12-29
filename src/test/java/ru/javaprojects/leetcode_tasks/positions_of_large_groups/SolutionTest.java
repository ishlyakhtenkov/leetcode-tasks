package ru.javaprojects.leetcode_tasks.positions_of_large_groups;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void largeGroupPositions() {
        Solution solution = new Solution();
        assertEquals(List.of(List.of(3, 6)), solution.largeGroupPositions("abbxxxxzzy"));
        assertEquals(List.of(List.of(3, 5), List.of(6, 9), List.of(12, 14)), solution.largeGroupPositions("abcdddeeeeaabbbcd"));
        assertEquals(List.of(), solution.largeGroupPositions("abc"));
        assertEquals(List.of(List.of(0, 2)), solution.largeGroupPositions("aaa"));
        assertEquals(List.of(List.of(2, 4)), solution.largeGroupPositions("bbaaa"));
    }
}