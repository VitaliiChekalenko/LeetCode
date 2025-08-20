package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testMovingZeros(int[] expected, int[] array) {
        Solution solution = new Solution();

        assertArrayEquals(expected, solution.moveZeroes(array));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(new int[]{4,2,4,3,5,1,0,0,0,0}, new int[]{4,2,4,0,0,3,0,5,1,0}),
                Arguments.of(new int[]{1,3,12,0,0}, new int[]{0,1,0,3,12}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{1,1,0}, new int[]{1,0,1})
        );
    }
}