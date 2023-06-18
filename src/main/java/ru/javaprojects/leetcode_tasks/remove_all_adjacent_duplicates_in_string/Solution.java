package ru.javaprojects.leetcode_tasks.remove_all_adjacent_duplicates_in_string;

import java.util.LinkedList;

class Solution {
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        LinkedList<Character> charList = new LinkedList<>();
        charList.add(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (!charList.isEmpty() && chars[i] == charList.getLast()) {
                charList.removeLast();
            } else {
                charList.addLast(chars[i]);
            }
        }
        char[] removedDuplicateChars = new char[charList.size()];
        for (int i = 0; i < removedDuplicateChars.length; i++) {
            removedDuplicateChars[i] = charList.poll();
        }
        return new String(removedDuplicateChars);
    }
}