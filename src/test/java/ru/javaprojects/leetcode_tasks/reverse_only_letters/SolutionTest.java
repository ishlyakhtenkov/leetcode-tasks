package ru.javaprojects.leetcode_tasks.reverse_only_letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseOnlyLetters() {
        Solution solution = new Solution();
        assertEquals("j-Ih-gfE-dCba", solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
        assertEquals("dc-ba", solution.reverseOnlyLetters("ab-cd"));
        assertEquals("Qedo1ct-eeLg=ntse-T!", solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}