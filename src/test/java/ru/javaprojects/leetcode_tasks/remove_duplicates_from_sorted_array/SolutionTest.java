package ru.javaprojects.leetcode_tasks.remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates() {
        Solution solution = new Solution();
        int[] testArray = {1, 1, 2};
        assertEquals(2, solution.removeDuplicates(testArray));
        assertEquals(1, testArray[0]);
        assertEquals(2, testArray[1]);

        testArray = new int[] {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, solution.removeDuplicates(testArray));
        assertEquals(0, testArray[0]);
        assertEquals(1, testArray[1]);
        assertEquals(2, testArray[2]);
        assertEquals(3, testArray[3]);
        assertEquals(4, testArray[4]);
    }
}