package ru.javaprojects.leetcode_tasks.valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z\\d]", "");
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}