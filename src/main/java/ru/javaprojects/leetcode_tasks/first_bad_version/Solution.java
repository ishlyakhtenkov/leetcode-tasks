package ru.javaprojects.leetcode_tasks.first_bad_version;

public class Solution extends VersionControl {

    // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

    public long firstBadVersion(long n) {
        long upperBorder = n;
        long lowerBorder = 0;
        while (true) {
            long version = (upperBorder + lowerBorder) / 2;
            if (version == lowerBorder || version == upperBorder) {
                return upperBorder;
            }
            boolean isBad = isBadVersion(version);
            if (isBad) {
                upperBorder = version;
            } else {
                lowerBorder = version;
            }
        }
    }
}