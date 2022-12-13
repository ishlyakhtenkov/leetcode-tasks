package ru.javaprojects.leetcode_tasks.long_pressed_name;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.charAt(0) != typed.charAt(0) || name.length() > typed.length()) {
            return false;
        }

        char[] nameChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();

        int typedIndex = 1;

        for (int i = 1; i < nameChars.length; i++) {
            if (typedIndex >= typedChars.length) {
                return false;
            }

            if (nameChars[i] != typedChars[typedIndex]) {
                int nameCharIndex = typed.indexOf(nameChars[i], typedIndex);
                if (nameCharIndex == -1) {
                    return false;
                }
                for (int j = typedIndex; j < nameCharIndex; j++) {
                    if (typedChars[j] != nameChars[i - 1]) {
                        return false;
                    }
                }
                typedIndex = nameCharIndex + 1;
            } else {
                typedIndex++;
            }
        }

        for (int i = typedIndex; i < typedChars.length; i++) {
            if (typedChars[i] != nameChars[nameChars.length - 1]) {
                return false;
            }
        }

        return true;
    }
}
