package ru.javaprojects.leetcode_tasks.greatest_common_divisor_of_strings;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String maxLengthString = str1.length() >= str2.length() ? str1 : str2;
        String minLengthString = str1.length() < str2.length() ? str1 : str2;

        String replaced = maxLengthString.replaceAll(minLengthString, "");

        if (replaced.length() == 0) {
            return minLengthString;
        }

        if (maxLengthString.length() == replaced.length()) {
            return "";
        }

        if (replaced.length() < minLengthString.length()) {
            if (minLengthString.replaceAll(replaced, "").length() == minLengthString.length()) {
                return "";
            }
        } else {
            if (replaced.replaceAll(minLengthString, "").length() == replaced.length()) {
                return "";
            }
        }

        String maxDivide = "";
        for (int i = 1; i < minLengthString.length(); i++) {
            String substring = minLengthString.substring(0, i);
            if (maxLengthString.replaceAll(substring, "").length() == 0 && minLengthString.replaceAll(substring, "").length() == 0) {
                if (substring.length() > maxDivide.length()) {
                    maxDivide = substring;
                }
            }
        }
        return maxDivide;
    }
}
