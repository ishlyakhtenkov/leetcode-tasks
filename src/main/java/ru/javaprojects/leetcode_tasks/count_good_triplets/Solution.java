package ru.javaprojects.leetcode_tasks.count_good_triplets;

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int goodTriplesCounter = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int firstNum = arr[i];
            for (int j = i + 1; j < arr.length - 1; j++) {
                int secondNum = arr[j];
                for (int k = j + 1; k < arr.length; k++) {
                    int thirdNum = arr[k];
                    if (Math.abs(firstNum - secondNum) <= a && Math.abs(secondNum - thirdNum) <= b && Math.abs(firstNum - thirdNum) <= c) {
                        goodTriplesCounter++;
                    }
                }
            }
        }
        return goodTriplesCounter;
    }
}
