package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getTrueParameters")
    void testTrueParams(int number) {
        Solution solution = new Solution();

        assertTrue(solution.isPerfectSquare(number));
    }

    @ParameterizedTest
    @MethodSource("getFalseParameters")
    void testFalseParameters(int number) {
        Solution solution = new Solution();

        assertFalse(solution.isPerfectSquare(number));
    }
    static Stream<Arguments> getTrueParameters() {
        return Stream.of(
                Arguments.of(16),
                Arguments.of(121),
                Arguments.of(10000)
        );
    }

    static Stream<Arguments> getFalseParameters() {
        return Stream.of(
                Arguments.of(17),
                Arguments.of(99),
                Arguments.of(8457)
        );
    }

}