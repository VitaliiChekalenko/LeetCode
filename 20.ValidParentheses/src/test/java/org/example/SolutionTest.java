package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SolutionTest {

    @ParameterizedTest
    @MethodSource("getTrueParameters")
    void testIsValidTrue(String value) {
        Solution sol = new Solution();

        assertTrue(sol.isValid(value));
    }

    @ParameterizedTest
    @MethodSource("getFalseParameters")
    void testIsValidFalse(String value) {
        Solution sol = new Solution();

        assertFalse(sol.isValid(value));
    }

    static Stream<Arguments> getTrueParameters() {
        return Stream.of(
                Arguments.of("()"),
                Arguments.of("(())"),
                Arguments.of("([])"),
                Arguments.of("[{}]"),
                Arguments.of("()[]{}")
        );
    }

    static Stream<Arguments> getFalseParameters() {
        return Stream.of(
                Arguments.of("(]"),
                Arguments.of("([)]"),
                Arguments.of("((")
        );
    }

}