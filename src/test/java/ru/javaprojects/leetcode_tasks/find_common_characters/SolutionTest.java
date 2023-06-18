package ru.javaprojects.leetcode_tasks.find_common_characters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void commonChars() {
        Solution solution = new Solution();
        assertEquals(List.of("e", "l", "l"), solution.commonChars(new String[]{"bella","glabel","roller"}));
        assertEquals(List.of("e", "l", "l"), solution.commonChars(new String[]{"bella","label","roller"}));
        assertEquals(List.of("c", "o"), solution.commonChars(new String[]{"cool","lock","cook"}));
    }
}