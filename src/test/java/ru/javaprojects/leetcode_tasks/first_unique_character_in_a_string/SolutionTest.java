package ru.javaprojects.leetcode_tasks.first_unique_character_in_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstUniqChar() {
        Solution solution = new Solution();
        assertEquals(0, solution.firstUniqChar("leetcode"));
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
        assertEquals(-1, solution.firstUniqChar("aabb"));
    }
}