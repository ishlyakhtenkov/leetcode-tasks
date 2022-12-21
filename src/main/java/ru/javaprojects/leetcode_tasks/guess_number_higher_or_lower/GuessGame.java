package ru.javaprojects.leetcode_tasks.guess_number_higher_or_lower;

public class GuessGame {
    private int rightAnswer;

    public GuessGame(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public int guess(int num) {
        return Integer.compare(rightAnswer, num);
    }
}