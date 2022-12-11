package ru.javaprojects.leetcode_tasks.maximum_value_of_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maximumValue() {
        Solution solution = new Solution();
        assertEquals(5, solution.maximumValue(new String[]{"alic3","bob","3","4","00000"}));
        assertEquals(1, solution.maximumValue(new String[]{"1","01","001","0001"}));
    }
}