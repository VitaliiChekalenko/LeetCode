package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParameters")
    void testRemoveElement(int expected, int[] array, int removeNumber) {
        Solution sol = new Solution();

        assertEquals(expected, sol.removeElement(array, removeNumber));
    }

    static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(2, new int[] {3,2,2,3}, 3),
                Arguments.of(5, new int[] {0,1,2,2,3,0,4,2}, 2)
        );
    }

}