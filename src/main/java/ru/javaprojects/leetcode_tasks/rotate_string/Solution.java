package ru.javaprojects.leetcode_tasks.rotate_string;

class Solution {
    public boolean rotateString(String s, String goal) {
        char goalFirstLetter = goal.charAt(0);

        int searchIndex = 0;
        int goalFirstLetterIndex;
        while ((goalFirstLetterIndex = s.indexOf(goalFirstLetter, searchIndex)) != -1) {
            if (goal.equals(s.substring(goalFirstLetterIndex) + s.substring(0, goalFirstLetterIndex))) {
                return true;
            }
            searchIndex = goalFirstLetterIndex + 1;
        }
        return false;
    }
}