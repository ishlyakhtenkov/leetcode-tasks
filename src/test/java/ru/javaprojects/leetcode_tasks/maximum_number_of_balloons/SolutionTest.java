package ru.javaprojects.leetcode_tasks.maximum_number_of_balloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxNumberOfBalloons() {
        Solution solution = new Solution();
        assertEquals(1, solution.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, solution.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, solution.maxNumberOfBalloons("leetcode"));
    }
}