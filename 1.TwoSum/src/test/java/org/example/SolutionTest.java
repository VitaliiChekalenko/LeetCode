package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.params.provider.Arguments;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideTwoSumData")
    void testTwoSum(int[] nums, int target, int[] expected) {
        Solution sol = new Solution();
        assertArrayEquals(expected, sol.twoSum(nums, target));
    }

    static Stream<Arguments> provideTwoSumData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9,  new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6,  new int[]{1, 2}),
                Arguments.of(new int[]{3, 2, 3}, 6,  new int[]{0, 2})
        );
    }
}
