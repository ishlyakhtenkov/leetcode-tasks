package ru.javaprojects.leetcode_tasks.defanging_an_IP_address;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void defangIPaddr() {
        Solution solution = new Solution();
        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr("255.100.50.0"));
    }
}