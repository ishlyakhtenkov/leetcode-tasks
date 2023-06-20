package ru.javaprojects.leetcode_tasks.make_the_string_great;

import java.util.LinkedList;

class Solution {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        LinkedList<Character> charQueue = new LinkedList<>();
        charQueue.add(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (!charQueue.isEmpty() && Math.abs(charQueue.getLast() - chars[i]) == 32) {
                charQueue.removeLast();
            } else {
                charQueue.add(chars[i]);
            }
        }
        char[] goodChars = new char[charQueue.size()];
        int counter = 0;
        for (char c : charQueue) {
            goodChars[counter++] = c;
        }
        return new String(goodChars);
    }
}
