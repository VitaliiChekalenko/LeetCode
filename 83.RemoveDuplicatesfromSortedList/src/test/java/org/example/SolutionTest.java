package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testDeleteDuplicates(ListNode expected, ListNode value) {
        Solution solution = new Solution();

        assertEquals(expected, solution.deleteDuplicates(value));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(new ListNode(), new ListNode())
        );
    }

}