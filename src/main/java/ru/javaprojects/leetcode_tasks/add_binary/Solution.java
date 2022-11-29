package ru.javaprojects.leetcode_tasks.add_binary;

class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            a = addZeroes(a, b.length() - a.length());
        } else {
            b = addZeroes(b, a.length() - b.length());
        }

        StringBuilder builder = new StringBuilder();
        boolean isOne = false;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (!isOne) {
                    builder.append(0);
                    isOne = true;
                } else {
                    builder.append(1);
                }
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (isOne) {
                    builder.append(1);
                    isOne = false;
                } else {
                    builder.append(0);
                }
            } else {
                if (isOne) {
                    builder.append(0);
                } else {
                    builder.append(1);
                }
            }
        }
        if (isOne) {
            builder.append(1);
        }
        return builder.reverse().toString();
    }

    private String addZeroes(String s, int count) {
        StringBuilder sBuilder = new StringBuilder(s);
        while (count > 0) {
            sBuilder.insert(0, '0');
            count--;
        }
        s = sBuilder.toString();
        return s;
    }
}