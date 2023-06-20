package ru.javaprojects.leetcode_tasks.reformat_date;

class Solution {
    public String reformatDate(String date) {
        String[] dateParts = date.split(" ");
        String month = null;
        switch (dateParts[1]) {
            case "Jan" -> month = "01";
            case "Feb" -> month = "02";
            case "Mar" -> month = "03";
            case "Apr" -> month = "04";
            case "May" -> month = "05";
            case "Jun" -> month = "06";
            case "Jul" -> month = "07";
            case "Aug" -> month = "08";
            case "Sep" -> month = "09";
            case "Oct" -> month = "10";
            case "Nov" -> month = "11";
            case "Dec" -> month = "12";
        }
        String day = dateParts[0].substring(0, dateParts[0].length() - 2);
        if (day.length() == 1) {
            day = "0" + day;
        }
        return dateParts[2] + "-" + month + "-" + day;
    }
}
