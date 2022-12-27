package ru.javaprojects.leetcode_tasks.most_common_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mostCommonWord() {
        Solution solution = new Solution();
        assertEquals("ball", solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
        assertEquals("a", solution.mostCommonWord("a.", new String[] {}));
        assertEquals("b", solution.mostCommonWord("a, a, a, a, b,b,b,c, c", new String[] {"a"}));
    }
}