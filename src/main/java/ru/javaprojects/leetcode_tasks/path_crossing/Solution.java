package ru.javaprojects.leetcode_tasks.path_crossing;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        Coordinate currentCoordinate = new Coordinate(0, 0);
        Set<Coordinate> visitedCoordinates = new HashSet<>();
        visitedCoordinates.add(currentCoordinate);
        char[] directions = path.toCharArray();
        for (char direction : directions) {
            Coordinate nextCoordinate;
            if (direction == 'N') {
                nextCoordinate = new Coordinate(currentCoordinate.x, currentCoordinate.y + 1);
            } else if (direction == 'S') {
                nextCoordinate = new Coordinate(currentCoordinate.x, currentCoordinate.y - 1);
            } else if (direction == 'W') {
                nextCoordinate = new Coordinate(currentCoordinate.x - 1, currentCoordinate.y);
            } else {
                nextCoordinate = new Coordinate(currentCoordinate.x + 1, currentCoordinate.y);
            }
            boolean added = visitedCoordinates.add(nextCoordinate);
            if (!added) {
                return true;
            }
            currentCoordinate = nextCoordinate;
        }
        return false;
    }

    private record Coordinate(int x, int y) {
        @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Coordinate that = (Coordinate) o;
                return x == that.x && y == that.y;
            }

    }
}