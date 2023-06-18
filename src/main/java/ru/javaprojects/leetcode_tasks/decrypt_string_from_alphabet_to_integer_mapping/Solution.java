package ru.javaprojects.leetcode_tasks.decrypt_string_from_alphabet_to_integer_mapping;

class Solution {

    // a-i -->  97-105  --> 0-9 (48 - 57)
    // j-z -->  106-122 --> 10-26
    // 10#11#12
    public String freqAlphabets(String s) {
        StringBuilder mappedStringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; ) {
            if (chars[i] == '#') {
                char unitDigit = chars[i - 1];
                char tenDigit = chars[i - 2];
                char letter = (char) ((unitDigit - 48) + (tenDigit - 48) * 10 + 96);
                mappedStringBuilder.append(letter);
                i -= 3;
            } else {
                mappedStringBuilder.append((char) (chars[i] + 48));
                i--;
            }
        }
        return mappedStringBuilder.reverse().toString();
    }
}