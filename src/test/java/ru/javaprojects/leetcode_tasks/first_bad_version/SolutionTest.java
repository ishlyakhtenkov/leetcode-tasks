package ru.javaprojects.leetcode_tasks.first_bad_version;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstBadVersion() {
        Solution solution = new Solution();
//        assertEquals(3, solution.firstBadVersion(20));
//        assertEquals(1, solution.firstBadVersion(1));
//        assertEquals(10, solution.firstBadVersion(20));
        assertEquals(1000000000000000000L, solution.firstBadVersion(1000000000000000000L));
    }
}