package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testLongestPalindrome() {
        Solution solution = new Solution();

        assertEquals("cc", solution.longestPalindrome("ccd"));
        assertEquals("bb", solution.longestPalindrome("abb"));
        assertEquals("bab", solution.longestPalindrome("babad"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
        assertEquals("bb", solution.longestPalindrome("bb"));
    }

}