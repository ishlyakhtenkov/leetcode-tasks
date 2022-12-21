package ru.javaprojects.leetcode_tasks.keyboard_row;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findWords() {
        Solution solution = new Solution();
        assertArrayEquals(new String[] {"Alaska","Dad"}, solution.findWords(new String[] {"Hello","Alaska","Dad","Peace"}));
        assertArrayEquals(new String[] {}, solution.findWords(new String[] {"omk"}));
        assertArrayEquals(new String[] {"adsdf","sfd"}, solution.findWords(new String[] {"adsdf","sfd"}));
    }
}