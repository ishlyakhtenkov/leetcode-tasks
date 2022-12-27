package ru.javaprojects.leetcode_tasks.license_key_formatting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void licenseKeyFormatting() {
        Solution solution = new Solution();
        assertEquals("5F3Z-2E9W", solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        assertEquals("2-5G-3J", solution.licenseKeyFormatting("2-5g-3-J", 2));
        assertEquals("24A0-R74K", solution.licenseKeyFormatting("2-4A0r7-4k", 4));
    }
}