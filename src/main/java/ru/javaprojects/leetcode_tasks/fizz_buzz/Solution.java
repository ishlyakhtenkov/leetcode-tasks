package ru.javaprojects.leetcode_tasks.fizz_buzz;

import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream
                .iterate(1, i -> i <= n, i -> i + 1)
                .mapToObj(i -> (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : (i % 3 == 0) ? "Fizz" : (i % 5 == 0) ? "Buzz" : i + "")
                .toList();
    }
}