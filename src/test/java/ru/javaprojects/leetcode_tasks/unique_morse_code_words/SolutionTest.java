package ru.javaprojects.leetcode_tasks.unique_morse_code_words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniqueMorseRepresentations() {
        Solution solution = new Solution();
        assertEquals(2, solution.uniqueMorseRepresentations(new String[] {"gin","zen","gig","msg"}));
        assertEquals(1, solution.uniqueMorseRepresentations(new String[] {"a"}));
    }
}