package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testNumberOfSteps(int expected, int param) {
        Solution solution = new Solution();

        assertEquals(expected, solution.numberOfSteps(param));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(6, 14),
                Arguments.of(12, 123),
                Arguments.of(4, 8)
        );
    }
}