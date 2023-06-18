package ru.javaprojects.leetcode_tasks.minimum_absolute_difference;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minimumAbsDifference() {
        Solution solution = new Solution();
        assertEquals(List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4)), solution.minimumAbsDifference(new int[] {4,2,1,3}));
        assertEquals(List.of(List.of(1, 3)), solution.minimumAbsDifference(new int[] {1,3,6,10,15}));
        assertEquals(List.of(List.of(-14,-10), List.of(19,23), List.of(23,27)), solution.minimumAbsDifference(new int[] {3,8,-10,23,19,-4,-14,27}));
        assertEquals(List.of(List.of(26,27)), solution.minimumAbsDifference(new int[] {40,11,26,27,-20}));
    }
}