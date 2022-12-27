package ru.javaprojects.leetcode_tasks.license_key_formatting;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        int cursor = stringBuilder.length() - k;
        while (cursor > 0) {
            stringBuilder.insert(cursor, '-');
            cursor -= k;
        }
        return stringBuilder.toString();
    }
}
