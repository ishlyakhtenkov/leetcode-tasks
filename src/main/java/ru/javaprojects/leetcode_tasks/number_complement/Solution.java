package ru.javaprojects.leetcode_tasks.number_complement;

class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        char[] chars = binaryString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                chars[i] = '0';
            } else {
                chars[i] = '1';
            }
        }
        return Integer.parseInt(new String(chars), 2);
    }
}
