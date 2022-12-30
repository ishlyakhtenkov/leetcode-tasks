package ru.javaprojects.leetcode_tasks.uncommon_words_from_two_sentences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uncommonFromSentences() {
        Solution solution = new Solution();
        assertArrayEquals(new String[] {"sweet", "sour"},
                solution.uncommonFromSentences("this apple is sweet", "this apple is sour"));
        assertArrayEquals(new String[] {"banana"},
                solution.uncommonFromSentences("apple apple", "banana"));
    }
}