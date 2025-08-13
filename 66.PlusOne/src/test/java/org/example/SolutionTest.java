package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParamenters")
    void testPlusOne(int[] expected, int[] array) {
        Solution solution = new Solution();

        assertArrayEquals(expected, solution.plusOne(array));
    }

    static Stream<Arguments> getParamenters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 4}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{4, 3, 2, 2}, new int[]{4, 3, 2, 1}),
                Arguments.of(new int[]{1, 0}, new int[]{9}),
                Arguments.of(new int[]{1, 0, 0, 0, 0}, new int[]{9, 9, 9, 9})
        );
    }

    @Test
    void testPlus() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{9, 9, 0, 0}, solution.plusOne(new int[]{9, 8, 9, 9}));
    }
}