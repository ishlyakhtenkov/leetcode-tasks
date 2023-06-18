package ru.javaprojects.leetcode_tasks.lucky_numbers_in_a_matrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    // [ 3, 7, 8]
    // [ 9,11,13]
    // [15,16,17]
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minimumInRow = matrix[i][0];
            int minimumInRowIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minimumInRow) {
                    minimumInRow = matrix[i][j];
                    minimumInRowIndex = j;
                }
            }
            int maximumInColumn = matrix[0][minimumInRowIndex];
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[j][minimumInRowIndex] > maximumInColumn) {
                    maximumInColumn = matrix[j][minimumInRowIndex];
                }
            }
            if (minimumInRow == maximumInColumn) {
                luckyNumbers.add(minimumInRow);
            }
        }
        return luckyNumbers;
    }
}