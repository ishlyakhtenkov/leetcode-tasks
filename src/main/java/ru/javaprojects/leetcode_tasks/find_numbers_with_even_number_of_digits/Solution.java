package ru.javaprojects.leetcode_tasks.find_numbers_with_even_number_of_digits;

class Solution {
    public int findNumbers(int[] nums) {
        int numberCounter = 0;
        for (int num : nums) {
            int digitsCounter = 0;
            do {
                digitsCounter++;
                num /= 10;
            }
            while (num > 0);
            if (digitsCounter % 2 == 0) {
                numberCounter++;
            }
        }
        return numberCounter;
    }
}
