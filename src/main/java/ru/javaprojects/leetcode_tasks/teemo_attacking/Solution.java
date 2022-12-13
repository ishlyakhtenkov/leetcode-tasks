package ru.javaprojects.leetcode_tasks.teemo_attacking;

class Solution {
    // duration = 4
    // 1 2 3 4  total = 4  end = 4
    // on 3 sec
    // 3 4 5 6 sum = 6  end = 6

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisonTime = 0;
        int poisonEndTime = -1;
        for (int i = 0; i < timeSeries.length; i++) {
            int attackSecond = timeSeries[i];
            if (attackSecond <= poisonEndTime) {
                int newPoisonEndTime = attackSecond + duration - 1;
                totalPoisonTime += (newPoisonEndTime - poisonEndTime);
                poisonEndTime = newPoisonEndTime;
            } else {
                poisonEndTime = attackSecond + duration - 1;
                totalPoisonTime += duration;
            }
        }
        return totalPoisonTime;
    }
}
