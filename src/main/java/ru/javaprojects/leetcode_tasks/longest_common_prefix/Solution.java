package ru.javaprojects.leetcode_tasks.longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String firstString = strs[0];
        int firstStringLength = firstString.length();
        int prefixCounter = -1;
        for (int i = 1; i < strs.length; i++) {
            String tempString = strs[i];
            int minLength = Math.min(firstStringLength, tempString.length());
            int tempPrefixCounter = 0;
            for (int j = 0; j < minLength; j++) {
                if (firstString.charAt(j) == tempString.charAt(j)) {
                    tempPrefixCounter++;
                } else {
                    break;
                }
            }
            if (prefixCounter == -1) {
                prefixCounter = tempPrefixCounter;
            } else if (prefixCounter > tempPrefixCounter) {
                prefixCounter = tempPrefixCounter;
            }
        }
        if (prefixCounter == -1) {
            return "";
        }
        return firstString.substring(0, prefixCounter);
    }
}