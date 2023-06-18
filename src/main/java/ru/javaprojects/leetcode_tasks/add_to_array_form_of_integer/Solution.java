package ru.javaprojects.leetcode_tasks.add_to_array_form_of_integer;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int numCursor = num.length - 1;
        boolean addTen = false;
        while (k > 0) {
            int kDigit = k % 10;
            int numDigit = numCursor >= 0 ? num[numCursor] : 0;
            int resultDigit = kDigit + numDigit;
            if (addTen) {
                resultDigit++;
                addTen = false;
            }
            if (resultDigit > 9) {
                resultDigit = resultDigit % 10;
                addTen = true;
            }
            result.add(0, resultDigit);
            k /= 10;
            numCursor--;
        }
        while (numCursor >= 0) {
            int resultDigit = num[numCursor];
            if (addTen) {
                resultDigit++;
                addTen = false;
            }
            if (resultDigit > 9) {
                resultDigit = resultDigit % 10;
                addTen = true;
            }
            result.add(0, resultDigit);
            numCursor--;
        }
        if (addTen) {
            result.add(0, 1);
        }
        return result;
    }
}
