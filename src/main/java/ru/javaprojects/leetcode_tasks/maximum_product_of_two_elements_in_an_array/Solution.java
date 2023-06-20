package ru.javaprojects.leetcode_tasks.maximum_product_of_two_elements_in_an_array;

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = nums[0];
        int max2 = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max1 ) {
                int temp = max1;
                max1 = nums[i];
                if (temp > max2) {
                    max2 = temp;
                }
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
