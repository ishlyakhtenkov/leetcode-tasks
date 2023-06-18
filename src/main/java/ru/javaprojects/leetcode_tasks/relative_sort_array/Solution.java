package ru.javaprojects.leetcode_tasks.relative_sort_array;

import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> arr1ElementsCounter = new HashMap<>();
        for (int element : arr1) {
            arr1ElementsCounter.merge(element, 1, Integer::sum);
        }
        int[] sortedArray = new int[arr1.length];
        int sortedArrayCursor = 0;
        for (int element : arr2) {
            Integer counter = arr1ElementsCounter.remove(element);
            for (int i = 0; i < counter; i++) {
                sortedArray[sortedArrayCursor] = element;
                sortedArrayCursor++;
            }
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(arr1ElementsCounter.entrySet());
        entries.sort(Comparator.comparingInt(Map.Entry::getKey));
        for (Map.Entry<Integer, Integer> entry : entries) {
            for (int i = 0; i < entry.getValue(); i++) {
                sortedArray[sortedArrayCursor] = entry.getKey();
                sortedArrayCursor++;
            }
        }
        return sortedArray;
    }
}
