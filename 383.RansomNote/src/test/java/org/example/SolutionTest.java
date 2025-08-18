package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParamsTrue")
    void testCanConstructTrue(String a, String b) {
        Solution solution = new Solution();

        assertTrue(solution.canConstruct(a, b));
    }

    @ParameterizedTest
    @MethodSource("getParamsFalse")
    void testCanConstructFalse(String a, String b) {
        Solution solution = new Solution();

        assertFalse(solution.canConstruct(a, b));
    }

    static Stream<Arguments> getParamsTrue() {
        return Stream.of(
          Arguments.of("aaaa", "dsdaaaab"),
          Arguments.of("aabcd", "aabaasdc"),
          Arguments.of("aa", "aab")
        );
    }

    static Stream<Arguments> getParamsFalse() {
        return Stream.of(
                Arguments.of("a", "b"),
                Arguments.of("aa", "ab"),
                Arguments.of("aa", "bb")
        );
    }

}