package ru.javaprojects.leetcode_tasks.flipping_an_image;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void flipAndInvertImage() {
        Solution solution = new Solution();
        assertTrue(Arrays.deepEquals(new int[][]{{1,0,0}, {0,1,0}, {1,1,1}},
                solution.flipAndInvertImage(new int[][]{{1,1,0}, {1,0,1}, {0,0,0}})));

        assertTrue(Arrays.deepEquals(new int[][]{{1,1,0,0}, {0,1,1,0}, {0,0,0,1}, {1,0,1,0}},
                solution.flipAndInvertImage(new int[][]{{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}})));
    }
}