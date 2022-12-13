package ru.javaprojects.leetcode_tasks.ransom_note;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = ransomNote.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!magazine.contains("" + chars[i])) {
                return false;
            }
            magazine = magazine.replaceFirst("" + chars[i], "");
        }
        return true;
    }
}