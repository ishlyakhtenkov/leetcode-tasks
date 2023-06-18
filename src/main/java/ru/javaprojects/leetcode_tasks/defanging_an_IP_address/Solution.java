package ru.javaprojects.leetcode_tasks.defanging_an_IP_address;

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
