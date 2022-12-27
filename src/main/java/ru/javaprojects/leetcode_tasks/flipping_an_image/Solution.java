package ru.javaprojects.leetcode_tasks.flipping_an_image;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int arrayLength = image[i].length;
            for (int j = 0; j < arrayLength / 2; j++) {
                int temp = image[i][j];
                if (image[i][arrayLength - 1 - j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
                if (temp == 0) {
                    image[i][arrayLength - 1 - j] = 1;
                } else {
                    image[i][arrayLength - 1 - j] = 0;
                }
            }
            if (arrayLength % 2 == 1) {
                if (image[i][arrayLength / 2] == 1) {
                    image[i][arrayLength / 2] = 0;
                } else {
                    image[i][arrayLength / 2] = 1;
                }
            }
        }
        return image;
    }
}