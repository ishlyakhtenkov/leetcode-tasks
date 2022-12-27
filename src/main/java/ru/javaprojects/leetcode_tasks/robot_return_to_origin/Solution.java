package ru.javaprojects.leetcode_tasks.robot_return_to_origin;

class Solution {
    public boolean judgeCircle(String moves) {
        int xCoordinate = 0;
        int yCoordinate = 0;
        char[] movesData = moves.toCharArray();
        for (int i = 0; i < movesData.length; i++) {
            if (movesData[i] == 'R') {
                xCoordinate++;
            } else if (movesData[i] == 'L') {
                xCoordinate--;
            } else if (movesData[i] == 'U') {
                yCoordinate++;
            } else {
                yCoordinate--;
            }
        }
        return xCoordinate == 0 && yCoordinate == 0;
    }
}