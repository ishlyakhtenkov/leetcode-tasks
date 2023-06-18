package ru.javaprojects.leetcode_tasks.replace_elements_with_greatest_element_on_right_side;

class Solution {

    // in 17,18,5,4,6, 1
    //out 18, 6,6,6,1,-1
    public int[] replaceElements(int[] arr) {
        int rightSideGreatestElement = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightSideGreatestElement;
            if (temp > rightSideGreatestElement) {
                rightSideGreatestElement = temp;
            }
        }
        return arr;
    }
}