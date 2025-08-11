package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParmenters")
    void testSearchElementPosition(int[] array, int target, int res) {
        Solution sol = new Solution();

        assertEquals(res, sol.searchInsert(array, target));
    }

    static Stream<Arguments> getParmenters() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,6}, 5, 2),
                Arguments.of(new int[]{1,3,5,6}, 2, 1),
                Arguments.of(new int[]{1,3,5,6}, 7, 4)
        );
    }
}