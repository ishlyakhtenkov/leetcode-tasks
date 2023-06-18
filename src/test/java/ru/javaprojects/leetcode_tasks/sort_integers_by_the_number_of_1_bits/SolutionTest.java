package ru.javaprojects.leetcode_tasks.sort_integers_by_the_number_of_1_bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortByBits() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0,1,2,4,8,3,5,6,7}, solution.sortByBits(new int[] {0,1,2,3,4,5,6,7,8}));
        assertArrayEquals(new int[] {1,2,4,8,16,32,64,128,256,512,1024}, solution.sortByBits(new int[] {1024,512,256,128,64,32,16,8,4,2,1}));
    }
}