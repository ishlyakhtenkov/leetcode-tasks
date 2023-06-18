package ru.javaprojects.leetcode_tasks.matrix_diagonal_sum;

class Solution {
    // 1 1 1 1 1
    // 2 2 2 2 2
    // 3 3 3 3 3
    // 4 4 4 4 4
    // 5 5 5 5 5

    public int diagonalSum(int[][] mat) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < mat.length; i++) {
            primaryDiagonalSum += mat[i][i];
            secondaryDiagonalSum += mat[i][mat.length - 1 - i];
        }
        if (mat.length % 2 == 0) {
            return primaryDiagonalSum + secondaryDiagonalSum;
        } else {
            return primaryDiagonalSum + secondaryDiagonalSum - mat[mat.length / 2][mat.length / 2];
        }
    }
}