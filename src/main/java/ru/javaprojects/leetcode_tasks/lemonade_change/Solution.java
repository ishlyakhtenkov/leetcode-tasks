package ru.javaprojects.leetcode_tasks.lemonade_change;

class Solution {
    // [5,5,5,10,20]

    public boolean lemonadeChange(int[] bills) {
        int fiveCounter = 0;
        int tenCounter = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCounter++;
            } else if (bill == 10) {
                if (fiveCounter == 0) {
                    return false;
                }
                tenCounter++;
                fiveCounter--;
            } else if (bill == 20) {
                if (fiveCounter == 0) {
                    return false;
                }
                if (tenCounter > 0) {
                    tenCounter--;
                    fiveCounter--;
                } else if (fiveCounter >= 3) {
                    fiveCounter -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}