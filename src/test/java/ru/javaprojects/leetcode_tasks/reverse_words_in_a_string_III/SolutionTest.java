package ru.javaprojects.leetcode_tasks.reverse_words_in_a_string_III;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseWords() {
        Solution solution = new Solution();
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"));
        assertEquals("doG gniD", solution.reverseWords("God Ding"));
    }
}