package ru.javaprojects.leetcode_tasks.reformat_the_string;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformat(String s) {
        char[] chars = s.toCharArray();
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                letters.add(c);
            }
        }
        if (Math.abs(digits.size() - letters.size()) > 1) {
            return "";
        }
        List<Character> shortCharList = letters.size() <= digits.size() ? letters : digits;
        List<Character> longCharList = letters.size() > digits.size() ? letters : digits;
        char[] reformatStringChars = new char[s.length()];
        int reformatStringCharsCursor = 0;
        for (int i = 0; i < shortCharList.size(); i++) {
            reformatStringChars[reformatStringCharsCursor++] = longCharList.get(i);
            reformatStringChars[reformatStringCharsCursor++] = shortCharList.get(i);
        }
        if (longCharList.size() > shortCharList.size()) {
            reformatStringChars[reformatStringCharsCursor] = longCharList.get(longCharList.size() - 1);
        }
        return new String(reformatStringChars);
    }
}