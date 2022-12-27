package ru.javaprojects.leetcode_tasks.assign_cookies;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildrenAmount = 0;
        int cookiesCursor = 0;
        boolean foundNext;
        for (int i = 0; i < g.length; i++) {
            foundNext = false;
            for (int j = cookiesCursor; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    contentChildrenAmount++;
                    cookiesCursor = j + 1;
                    foundNext = true;
                    break;
                }
            }
            if (!foundNext) {
                break;
            }
        }
        return contentChildrenAmount;
    }
}