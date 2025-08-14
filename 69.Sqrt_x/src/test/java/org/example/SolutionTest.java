package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testMySqrt(int expected, int value) {
        Solution solution = new Solution();

        assertEquals(expected, solution.mySqrt(value));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(2 ,4),
                Arguments.of(4 ,16),
                Arguments.of(5 ,25)
        );
    }
}