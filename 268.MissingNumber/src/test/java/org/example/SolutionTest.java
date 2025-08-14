package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testMissingNumber(int expected, int[] array) {
        Solution solution = new Solution();

        assertEquals(expected, solution.missingNumber(array));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(2, new int[]{3,0,1}),
                Arguments.of(2, new int[]{0,1}),
                Arguments.of(8, new int[]{9,6,4,2,3,5,7,0,1})
        );
    }
}