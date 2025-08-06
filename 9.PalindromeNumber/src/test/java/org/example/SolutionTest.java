package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("parametersPos")
    void testIsPalindromePositive(int num) {
        Solution sol = new Solution();

        assertTrue(sol.isPalindrome(num));
    }

    @ParameterizedTest
    @MethodSource("parametersNeg")
    void testIsPalindromeNegative(int num) {
        Solution sol = new Solution();

        assertFalse(sol.isPalindrome(num));
    }

    static Stream<Arguments> parametersPos() {
        return Stream.of(
                Arguments.of(121),
                Arguments.of(1234321),
                Arguments.of(0)
        );
    }

    static Stream<Arguments> parametersNeg() {
        return Stream.of(
                Arguments.of(1231),
                Arguments.of(-121),
                Arguments.of(12344321)
        );
    }

}