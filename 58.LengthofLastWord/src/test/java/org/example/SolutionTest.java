package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParametersTrue")
    void testLengthOfLastWordTrue(int expected, String text) {
        Solution solution = new Solution();

        Assertions.assertEquals(expected, solution.lengthOfLastWord(text));
    }

    static Stream<Arguments> getParametersTrue() {
        return Stream.of(
                Arguments.of(5 , "Hello World"),
                Arguments.of(4 , "   fly me   to   the moon  "),
                Arguments.of(6, "luffy is still joyboy")
        );
    }

}