package ru.javaprojects.leetcode_tasks.distance_between_bus_stops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void distanceBetweenBusStops() {
        Solution solution = new Solution();
        assertEquals(1, solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
        assertEquals(3, solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2));
        assertEquals(4, solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
        assertEquals(17, solution.distanceBetweenBusStops(new int[]{7, 10, 1, 12, 11, 14, 5, 0}, 7, 2));
        assertEquals(28, solution.distanceBetweenBusStops(new int[]{3, 6, 7, 2, 9, 10, 7, 16, 11}, 6, 2));
    }
}