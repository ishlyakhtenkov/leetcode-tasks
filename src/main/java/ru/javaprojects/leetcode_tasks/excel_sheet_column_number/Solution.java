package ru.javaprojects.leetcode_tasks.excel_sheet_column_number;

class Solution {
    public int titleToNumber(String columnTitle) {
        int number = 0;
        int rank = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            number += (c - 64) * Math.pow(26, rank);
            rank++;
        }
        return number;
    }
}