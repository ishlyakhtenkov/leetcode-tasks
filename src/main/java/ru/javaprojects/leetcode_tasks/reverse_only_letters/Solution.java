package ru.javaprojects.leetcode_tasks.reverse_only_letters;

class Solution {
    // 65-90
    // 97-122

    // ab-cd

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int leftCursor = 0;
        int rightCursor = chars.length - 1;
        while (leftCursor < rightCursor) {
            char left = chars[leftCursor];
            if (isLetter(left)) {
                char right = chars[rightCursor];
                while (!isLetter(right) && leftCursor < rightCursor) {
                    rightCursor--;
                    right = chars[rightCursor];
                }
                if (left != right && isLetter(right)) {
                    chars[leftCursor] = right;
                    chars[rightCursor] = left;
                }
                if (isLetter(right)) {
                    rightCursor--;
                }
            }
            leftCursor++;
        }
        return new String(chars);
    }

    private boolean isLetter(char c) {
        return Character.isLetter(c);
    }
}