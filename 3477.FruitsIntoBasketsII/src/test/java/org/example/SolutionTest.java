package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void testUnplaceFruitsParameterized(int[] fruits, int[] baskets, int expected) {
        Solution sol= new Solution();

        assertEquals(expected, sol.numOfUnplacedFruits(fruits, baskets));
    }

    static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{4,2,5}, new int[]{3,5,4}, 1),
                Arguments.of(new int[]{3,6,1}, new int[]{6,4,7}, 0),
                Arguments.of(new int[]{4,2,5}, new int[]{3,5,4}, 1)
        );
    }
}