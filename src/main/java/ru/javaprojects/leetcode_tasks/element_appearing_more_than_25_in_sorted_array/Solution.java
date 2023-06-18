package ru.javaprojects.leetcode_tasks.element_appearing_more_than_25_in_sorted_array;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int element = arr[0];
        int elementAppearanceCounter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (elementAppearanceCounter * 100.0 / arr.length > 25) {
                return element;
            }
            if (arr[i] == element) {
                elementAppearanceCounter++;
            } else {
                element = arr[i];
                elementAppearanceCounter = 1;
            }
        }
        return element;
    }
}
