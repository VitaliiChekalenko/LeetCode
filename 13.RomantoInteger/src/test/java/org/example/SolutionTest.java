package org.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    @ParameterizedTest
    @MethodSource("parametersPositive")
    void testRomePositive(String rome, int result) {
        Solution sol = new Solution();

        assertEquals(result, sol.romanToInt(rome));
    }

    @ParameterizedTest
    @MethodSource("parametersNegative")
    void testRomeNegative(String rome, int result) {
        Solution sol = new Solution();

        assertEquals(result, sol.romanToInt(rome));
    }

    static Stream<Arguments> parametersPositive() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)

        );
    }

    static Stream<Arguments> parametersNegative() {
        return Stream.of(
                Arguments.of("III", 4),
                Arguments.of("LVIII", 20),
                Arguments.of("MCMXCIV", 10)

        );
    }
}