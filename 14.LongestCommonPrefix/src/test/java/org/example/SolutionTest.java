package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getPositiveParameters")
    void testPositiveParameters(String[] input, String output) {
        Solution sol = new Solution();

        assertEquals(output, sol.longestCommonPrefix(input));
    }

    @ParameterizedTest
    @MethodSource("getNegativeParameters")
    void testNegativeParameters(String[] input, String output){
        Solution sol = new Solution();

        assertEquals(output, sol.longestCommonPrefix(input));
    }


    static Stream<Arguments> getPositiveParameters() {
        return Stream.of(
                Arguments.of(new String[] {"flower","flow","flight"}, "fl"),
                Arguments.of(new String[] {"dog","racecar","car"}, ""),
                Arguments.of(new String[] {"a"}, "a"),
                Arguments.of(new String[] {"ab", "a"}, "a"),
                Arguments.of(new String[] {"flower","flower","flower","flower"}, "flower"),
                Arguments.of(new String[] {"reflower","flow","flight"}, "")
        );
    }

    static Stream<Arguments> getNegativeParameters() {
        return Stream.of(
                Arguments.of(new String[] {"flower","flow","flight"}, "w"),
                Arguments.of(new String[] {"dog","racecar","car"}, "w")
        );
    }
}
