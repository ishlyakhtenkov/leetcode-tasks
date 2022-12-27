package ru.javaprojects.leetcode_tasks.number_of_lines_to_write_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numberOfLines() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {3, 60},
                solution.numberOfLines(new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                        "abcdefghijklmnopqrstuvwxyz"));

        assertArrayEquals(new int[] {2, 4},
                solution.numberOfLines(new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                        "bbbcccdddaaa"));
    }
}