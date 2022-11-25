package ru.javaprojects.leetcode_tasks.valid_parentheses;

import java.util.LinkedList;

public class Solution {
    public static final char ROUND_OPEN = '(';
    public static final char SQUARE_OPEN = '[';
    public static final char FIGURE_OPEN = '{';

    public boolean isValid(String s) {
        LinkedList<Character> openParentheses = new LinkedList<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isOpen(chars[i])) {
                openParentheses.push(chars[i]);
            } else {
                Character openParenthesis = openParentheses.poll();
                if (openParenthesis == null || !isPair(openParenthesis, chars[i])) {
                    return false;
                }
            }
        }
        return openParentheses.isEmpty();
    }

    private boolean isOpen(char c) {
        return c == ROUND_OPEN || c == SQUARE_OPEN || c == FIGURE_OPEN;
    }

    private boolean isPair(char openParenthesis, char closeParenthesis) {
        int asciiInterval = closeParenthesis - openParenthesis;
        return asciiInterval == 1 || asciiInterval == 2;
    }
}
