package ru.javaprojects.leetcode_tasks.long_pressed_name;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isLongPressedNameWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.isLongPressedName("alex", "aaleex"));
        assertTrue(solution.isLongPressedName("alex", "aalllleeeexx"));
    }

    @Test
    void isLongPressedNameWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.isLongPressedName("saeed", "ssaaedd"));
        assertFalse(solution.isLongPressedName("alex", "aaleexxxz"));
        assertFalse(solution.isLongPressedName("alex", "aaleexxxzz"));
        assertFalse(solution.isLongPressedName("alex", "aaleexxxzzy"));
        assertFalse(solution.isLongPressedName("alexd", "ale"));
        assertFalse(solution.isLongPressedName("pyplrz", "ppyypllr"));
    }
}