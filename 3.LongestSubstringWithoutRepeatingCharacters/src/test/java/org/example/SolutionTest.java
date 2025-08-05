package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "'abcabcbb', 3",
            "'bbbbb', 1",
            "'pwwkew', 3",
            "'', 0",
            "'abcdef', 6",
            "'abba', 2",
            "'dvdf', 3"
    })
    void testString(String input, int expected) {
        Solution sol = new Solution();

        assertEquals(expected, sol.lengthOfLongestSubstring(input));
    }
}