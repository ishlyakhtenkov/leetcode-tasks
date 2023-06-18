package ru.javaprojects.leetcode_tasks.replace_all_q_to_avoid_consecutive_repeating_characters;

class Solution {
    public String modifyString(String s) {
        if (s.length() == 1) {
            return s.replaceAll("\\?", "a");
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                if (i == 0) {
                    if (chars[i + 1] == 'a') {
                        chars[i] = 'b';
                    } else {
                        chars[i] = 'a';
                    }
                } else if (i == chars.length - 1) {
                    if (chars[i - 1] == 'a') {
                        chars[i] = 'b';
                    } else {
                        chars[i] = 'a';
                    }
                } else {
                    if (chars[i - 1] == 'a') {
                        if (chars[i + 1] == 'b') {
                            chars[i] = 'c';
                        } else {
                            chars[i] = 'b';
                        }
                    } else {
                        if (chars[i + 1] == 'a') {
                            if (chars[i - 1] == 'b') {
                                chars[i] ='c';
                            } else {
                                chars[i] = 'b';
                            }
                        } else {
                            chars[i] = 'a';
                        }
                    }
                }
            }
        }
        return new String(chars);
    }
}
