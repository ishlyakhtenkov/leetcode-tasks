package ru.javaprojects.leetcode_tasks.add_digits;

class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int newNum = 0;
            while (num >= 10) {
                newNum += num % 10;
                num /= 10;
            }
            newNum += num;
            num = newNum;
        }
        return num;
    }
}