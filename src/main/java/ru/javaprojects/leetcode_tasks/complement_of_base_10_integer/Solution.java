package ru.javaprojects.leetcode_tasks.complement_of_base_10_integer;

class Solution {
    public int bitwiseComplement(int n) {
        byte[] binaryStringBytes = Integer.toBinaryString(n).getBytes();
        for (int i = 0; i < binaryStringBytes.length; i++) {
            if (binaryStringBytes[i] == 48) {
                binaryStringBytes[i] = 49;
            } else {
                binaryStringBytes[i] = 48;
            }
        }
        return Integer.parseInt(new String(binaryStringBytes), 2);
    }
}