package ru.javaprojects.leetcode_tasks.backspace_string_compare;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] sChars = s.toCharArray();
        StringBuilder sBuilder = new StringBuilder();
        removeBackSpaces(sChars, sBuilder);

        char[] tChars = t.toCharArray();
        StringBuilder tBuilder = new StringBuilder();
        removeBackSpaces(tChars, tBuilder);
        return tBuilder.toString().equals(sBuilder.toString());
    }

    private void removeBackSpaces(char[] sChars, StringBuilder sBuilder) {
        int backSpaceCounter = 0;
        for (int i = sChars.length - 1; i >= 0; i--) {
            if (sChars[i] == '#') {
                backSpaceCounter++;
            } else {
                if (backSpaceCounter == 0) {
                    sBuilder.append(sChars[i]);
                } else {
                    backSpaceCounter--;
                }
            }
        }
    }
}
