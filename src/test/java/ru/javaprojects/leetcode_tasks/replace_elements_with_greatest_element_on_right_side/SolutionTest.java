package ru.javaprojects.leetcode_tasks.replace_elements_with_greatest_element_on_right_side;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void replaceElements() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
        assertArrayEquals(new int[] {-1}, solution.replaceElements(new int[] {400}));
    }
}