package ru.javaprojects.leetcode_tasks.student_attendance_record;

class Solution {
    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int absentCounter = 0;
        int lateCounter = 0;
        for (char aChar : chars) {
            if (aChar == 'A') {
                lateCounter = 0;
                absentCounter++;
                if (absentCounter == 2) {
                    return false;
                }
            } else if (aChar != 'L') {
                lateCounter = 0;
            } else {
                lateCounter++;
                if (lateCounter == 3) {
                    return false;
                }
            }
        }
        return true;
    }
}