package ru.javaprojects.leetcode_tasks.palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        String value = x + "";
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
//        return new StringBuilder(value).reverse().toString().equals(value);
    }
}
