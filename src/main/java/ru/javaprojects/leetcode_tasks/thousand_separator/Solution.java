package ru.javaprojects.leetcode_tasks.thousand_separator;

class Solution {
    public String thousandSeparator(int n) {
        char[] numberChars = (n + "").toCharArray();
        int dotAmount = (numberChars.length - 1) / 3;
        if (dotAmount == 0) {
            return new String(numberChars);
        }
        char[] numberCharsWithDots = new char[numberChars.length + dotAmount];
        for (int i = numberChars.length - 1, j = numberCharsWithDots.length - 1, k = 0; i >= 0; j--) {
            if (k == 3) {
                numberCharsWithDots[j] = '.';
                k = 0;
            } else {
                numberCharsWithDots[j] = numberChars[i];
                i--;
                k++;
            }
        }
        return new String(numberCharsWithDots);
    }
}
