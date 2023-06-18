package ru.javaprojects.leetcode_tasks.add_to_array_form_of_integer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addToArrayForm() {
        Solution solution = new Solution();
        assertEquals(List.of(1, 2, 3, 4), solution.addToArrayForm(new int[] {1, 2, 0 ,0}, 34));
        assertEquals(List.of(4, 5, 5), solution.addToArrayForm(new int[] {2, 7, 4}, 181));
        assertEquals(List.of(1, 0, 2, 1), solution.addToArrayForm(new int[] {2, 1, 5}, 806));
        assertEquals(List.of(8, 1, 7), solution.addToArrayForm(new int[] {1, 1}, 806));
    }
}