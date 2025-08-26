package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testM(int expected, List<Integer> arr, int range) {
        Solution solution = new Solution();

        assertEquals(expected, solution.countPairs(arr, range));
    }


    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(3, List.of(-1,1,2,3,1), 2),
                Arguments.of(10, List.of(-6,2,5,-2,-7,-1,3), -2)
        );
    }
}