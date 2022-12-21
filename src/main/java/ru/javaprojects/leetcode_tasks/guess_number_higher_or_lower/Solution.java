package ru.javaprojects.leetcode_tasks.guess_number_higher_or_lower;

public class Solution extends GuessGame {

    public Solution(int rightAnswer) {
        super(rightAnswer);
    }

    public int guessNumber(int n) {
        long maxBorder = (int) Math.pow(2, 31);
        long lowBorder = 0;
        while (maxBorder >= lowBorder) {
            int number = (int) ((maxBorder + lowBorder) / 2);
            int guessResult = guess(number);

            if (guessResult == 0) {
                return number;
            }
            if (guessResult == -1) {
                maxBorder = number - 1;
            } else {
                lowBorder = number + 1;
            }
        }
        throw new RuntimeException("Value not found");
    }
}