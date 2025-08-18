package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testMiddleOfLinkedList(ListNode expected, ListNode listNode) {
        Solution solution = new Solution();

        assertEquals(expected, solution.middleNode(listNode));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(),
                Arguments.of(),
                Arguments.of()
        );
    }
}