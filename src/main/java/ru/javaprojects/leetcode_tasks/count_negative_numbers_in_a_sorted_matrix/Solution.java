package ru.javaprojects.leetcode_tasks.count_negative_numbers_in_a_sorted_matrix;

class Solution {
    public int countNegatives(int[][] grid) {
        int positiveCounter = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt >= 0) {
                    positiveCounter++;
                } else {
                    break;
                }
            }
        }
        return grid.length * grid[0].length - positiveCounter;
    }
}
