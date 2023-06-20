package ru.javaprojects.leetcode_tasks.day_of_the_year;

import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}
