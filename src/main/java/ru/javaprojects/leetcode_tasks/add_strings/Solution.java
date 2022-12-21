package ru.javaprojects.leetcode_tasks.add_strings;

class Solution {
    public String addStrings(String num1, String num2) {
        int minLength = Math.min(num1.length(), num2.length());
        StringBuilder sum = new StringBuilder();
        boolean addTen = false;
        for (int i = 1; i <= minLength; i++) {
            int digit1 = num1.charAt(num1.length() - i) - 48;
            int digit2 = num2.charAt(num2.length() - i) - 48;
            int twoDigitSum = digit1 + digit2;
            if (addTen) {
                twoDigitSum++;
                addTen = false;
            }
            if (twoDigitSum > 9) {
                addTen = true;
                twoDigitSum = twoDigitSum % 10;
            }
            sum.append(twoDigitSum);
        }
        if (num1.length() > num2.length()) {
            for (int i = num1.length() - minLength - 1; i >= 0; i--) {
                int digit = num1.charAt(i) - 48;
                if (addTen) {
                    digit++;
                    addTen = false;
                }
                if (digit == 10) {
                    addTen = true;
                    digit = 0;
                }
                sum.append(digit);
            }
            if (addTen) {
                sum.append(1);
                addTen = false;
            }
        }

        if (num2.length() > num1.length()) {
            for (int i = num2.length() - minLength - 1; i >= 0; i--) {
                int digit = num2.charAt(i) - 48;
                if (addTen) {
                    digit++;
                    addTen = false;
                }
                if (digit == 10) {
                    addTen = true;
                    digit = 0;
                }
                sum.append(digit);
            }
            if (addTen) {
                sum.append(1);
                addTen = false;
            }
        }

        if (num1.length() == num2.length() && addTen) {
            sum.append(1);
        }

        return sum.reverse().toString();
    }
}
