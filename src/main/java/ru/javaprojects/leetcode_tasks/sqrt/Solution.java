package ru.javaprojects.leetcode_tasks.sqrt;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        for (int i = 0; i < x; i++) {
            if ((long)i * i <= x && (long) (i + 1) * (i + 1) > x) {
                return i;
            }
        }
        return -1;
    }
}
