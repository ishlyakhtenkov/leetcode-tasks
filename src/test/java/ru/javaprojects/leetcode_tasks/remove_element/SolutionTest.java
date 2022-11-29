package ru.javaprojects.leetcode_tasks.remove_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeElement() {
        Solution solution = new Solution();
        int[] testArray = new int[]{3,2,2,3};
        assertEquals(2, solution.removeElement(testArray, 3));
        assertEquals(2, testArray[0]);
        assertEquals(2, testArray[1]);

        testArray = new int[]{0,1,2,2,3,0,4,2};
        assertEquals(5, solution.removeElement(testArray, 2));
        assertEquals(0, testArray[0]);
        assertEquals(0, testArray[1]);
        assertEquals(1, testArray[2]);
        assertEquals(3, testArray[3]);
        assertEquals(4, testArray[4]);

        testArray = new int[]{3, 3};
        assertEquals(0, solution.removeElement(testArray, 3));
        assertEquals(3, testArray[0]);
        assertEquals(3, testArray[1]);

        testArray = new int[]{4, 5};
        assertEquals(1, solution.removeElement(testArray, 4));
        assertEquals(5, testArray[0]);

        testArray = new int[]{2, 2, 3};
        assertEquals(2, solution.removeElement(testArray, 3));
        assertEquals(2, testArray[0]);
        assertEquals(2, testArray[1]);

        testArray = new int[]{2};
        assertEquals(1, solution.removeElement(testArray, 3));
        assertEquals(2, testArray[0]);
    }
}