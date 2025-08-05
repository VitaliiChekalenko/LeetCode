package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideFizzBuzzData")
    void testFizzBuzz(int input, List<String> expected) {
        Solution sol = new Solution();
        assertEquals(expected, sol.fizzBuzz(input));
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> provideFizzBuzzData() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(1, List.of("1")),
                org.junit.jupiter.params.provider.Arguments.of(3, List.of("1", "2", "Fizz")),
                org.junit.jupiter.params.provider.Arguments.of(5, List.of("1", "2", "Fizz", "4", "Buzz")),
                org.junit.jupiter.params.provider.Arguments.of(15, List.of(
                        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                        "11", "Fizz", "13", "14", "FizzBuzz"
                ))
        );
    }
}
