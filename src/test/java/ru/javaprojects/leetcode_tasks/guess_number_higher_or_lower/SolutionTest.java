package ru.javaprojects.leetcode_tasks.guess_number_higher_or_lower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void guessNumber() {
        Solution solution = new Solution(6);
        assertEquals(6, solution.guessNumber(10));

        solution = new Solution(1);
        assertEquals(1, solution.guessNumber(1));

        solution = new Solution(1);
        assertEquals(1, solution.guessNumber(2));

        solution = new Solution(1702766719);
        assertEquals(1702766719, solution.guessNumber(2126753390));

        solution = new Solution(2147483647);
        assertEquals(2147483647, solution.guessNumber(2147483647));
    }
}