package ru.javaprojects.leetcode_tasks.distance_between_bus_stops;

import java.util.ArrayList;
import java.util.List;

class Solution {
    // start 6  dest 2

    // 0  1  2  3  4  5   6  7   8
    // 3, 6, 7, 2, 9, 10, 7, 16, 11

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWiseDistance = 0;
        if (destination < start) {
            for (int i = start; i < distance.length; i++) {
                clockWiseDistance += distance[i];
            }
            for (int i = 0; i < destination; i++) {
                clockWiseDistance += distance[i];
            }
        } else {
            for (int i = start; i < destination; i++) {
                clockWiseDistance += distance[i];
            }
        }

        int counterclockwiseDistance = 0;
        if (start > destination) {
            for (int i = start - 1; i >= destination; i--) {
                counterclockwiseDistance += distance[i];
            }
        } else {
            for (int i = start - 1; i >= 0; i--) {
                counterclockwiseDistance += distance[i];
            }
            for (int i = distance.length - 1; i >= destination; i--) {
                counterclockwiseDistance += distance[i];
            }
        }
        return Math.min(clockWiseDistance, counterclockwiseDistance);
    }
}
