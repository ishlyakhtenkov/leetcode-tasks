package ru.javaprojects.leetcode_tasks.string_matching_in_an_array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void stringMatching() {
        Solution solution = new Solution();
        assertEquals(List.of("od", "leetcode","am"), solution.stringMatching(new String[]{"leetcoder","leetcode","od","hamlet","am"}));
        assertEquals(List.of("as","hero"), solution.stringMatching(new String[]{"mass","as","hero","superhero"}));
        assertEquals(List.of("code", "et"), solution.stringMatching(new String[]{"leetcode","et","code"}));
        assertEquals(List.of(), solution.stringMatching(new String[]{"blue","green","bu"}));
    }
}