package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource("getValues")
    void testPositive(int expected, int[] actual) {
        Solution sol = new Solution();

        Assertions.assertEquals(expected, sol.removeDuplicates(actual));
    }

    static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(2, new int[]{1,1,2}),
                Arguments.of(5, new int[]{0,0,1,1,1,2,2,3,3,4})
        );
    }
}
