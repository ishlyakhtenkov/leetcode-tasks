package ru.javaprojects.leetcode_tasks.find_words_that_can_be_formed_by_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countCharacters() {
        Solution solution = new Solution();
        assertEquals(6, solution.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
        assertEquals(10, solution.countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }
}