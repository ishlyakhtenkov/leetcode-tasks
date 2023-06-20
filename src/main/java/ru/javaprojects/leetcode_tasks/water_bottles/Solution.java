package ru.javaprojects.leetcode_tasks.water_bottles;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunkBottles = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int fullBottles = emptyBottles / numExchange;
            drunkBottles += fullBottles;
            emptyBottles = emptyBottles - fullBottles * numExchange + fullBottles;
        }
        return drunkBottles;
    }
}