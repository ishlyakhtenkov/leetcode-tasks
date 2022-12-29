package ru.javaprojects.leetcode_tasks.number_of_lines_to_write_string;

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lineCounter = 1;
        int currentLineSpace = 100;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int charWidth = widths[chars[i] - 97];
            if (currentLineSpace - charWidth >= 0) {
                currentLineSpace -= charWidth;
            } else {
                lineCounter++;
                currentLineSpace = 100 - charWidth;
            }
        }
        return new int[]{lineCounter, 100 - currentLineSpace};
    }
}
