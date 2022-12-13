package ru.javaprojects.leetcode_tasks.shortest_distance_to_a_character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shortestToChar() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, solution.shortestToChar("loveleetcode", 'e'));
        assertArrayEquals(new int[] {3,2,1,0}, solution.shortestToChar("aaab", 'b'));
    }
}