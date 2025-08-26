package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testM(int expected, int[] arr) {
        Solution solution = new Solution();

        assertEquals(expected, solution.peakIndexInMountainArray(arr));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(2, new int[]{3,4,5,1}),
                Arguments.of(1, new int[]{0,10,5,2}),
                Arguments.of(1, new int[]{0,1,0}),
                Arguments.of(1, new int[]{0,2,1,0})
        );
    }

}