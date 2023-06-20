package ru.javaprojects.leetcode_tasks.check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPrefixOfWord() {
        Solution solution = new Solution();
        assertEquals(4, solution.isPrefixOfWord("i love eating burger", "burg"));
        assertEquals(2, solution.isPrefixOfWord("this problem is an easy problem", "pro"));
        assertEquals(-1, solution.isPrefixOfWord("i am tired", "you"));
    }
}