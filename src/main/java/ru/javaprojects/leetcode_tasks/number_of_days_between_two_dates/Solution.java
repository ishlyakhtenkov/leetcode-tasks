package ru.javaprojects.leetcode_tasks.number_of_days_between_two_dates;

import java.time.LocalDate;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return (int) (Math.abs(LocalDate.parse(date2).toEpochDay() - LocalDate.parse(date1).toEpochDay()));
    }
}