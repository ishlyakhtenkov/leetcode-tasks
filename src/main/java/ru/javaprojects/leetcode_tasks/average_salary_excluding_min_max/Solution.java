package ru.javaprojects.leetcode_tasks.average_salary_excluding_min_max;

public class Solution {
    public double average(int[] salary) {
        int minSalary = salary[0];
        int maxSalary = salary[0];
        int salarySum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (minSalary > salary[i]) {
                minSalary = salary[i];
            }
            if (maxSalary < salary[i]) {
                maxSalary = salary[i];
            }
            salarySum += salary[i];
        }
        return (double) (salarySum - maxSalary - minSalary) / (salary.length - 2);
    }
}