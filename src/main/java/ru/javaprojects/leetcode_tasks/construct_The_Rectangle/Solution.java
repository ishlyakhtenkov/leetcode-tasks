package ru.javaprojects.leetcode_tasks.construct_The_Rectangle;

class Solution {
    public int[] constructRectangle(int area) {
        int[] sides = new int[] {area, 1};
        for (int length = area - 1; length > 0; length--) {
            if (area % length == 0) {
                int width = area / length;
                if (length >= width && sides[0] - sides[1] > length - width) {
                    sides[0] = length;
                    sides[1] = width;
                }
            }
        }
        return sides;
    }
}