package ru.javaprojects.leetcode_tasks.defuse_the_bomb;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] decryptedCode = new int[code.length];
        if (k > 0) {
            for (int i = 0; i < decryptedCode.length; i++) {
                int sumKNextNums = 0;
                int nextNumIndex = i + 1;
                for (int j = 0; j < k; j++) {
                    if (nextNumIndex > code.length - 1) {
                        nextNumIndex = 0;
                    }
                    sumKNextNums += code[nextNumIndex];
                    nextNumIndex++;
                }
                decryptedCode[i] = sumKNextNums;
            }
        }
        if (k < 0) {
            for (int i = 0; i < decryptedCode.length; i++) {
                int sumKPreviousNums = 0;
                int previousNumIndex = i - 1;
                for (int j = 0; j < -k; j++) {
                    if (previousNumIndex < 0) {
                        previousNumIndex = code.length - 1;
                    }
                    sumKPreviousNums += code[previousNumIndex];
                    previousNumIndex--;
                }
                decryptedCode[i] = sumKPreviousNums;
            }
        }
        return decryptedCode;
    }
}
