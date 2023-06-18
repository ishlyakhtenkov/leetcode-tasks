package ru.javaprojects.leetcode_tasks.distribute_candies_to_people;

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] candiesPerPerson = new int[num_people];
        int personIndex = 0;
        int candiesCounter = 1;
        while (candies > 0) {
            if (candiesCounter > candies) {
                candiesCounter = candies;
            }
            candiesPerPerson[personIndex] += candiesCounter;
            candies -= candiesCounter;
            candiesCounter++;
            personIndex++;
            if (personIndex == num_people) {
                personIndex = 0;
            }
        }
        return candiesPerPerson;
    }
}