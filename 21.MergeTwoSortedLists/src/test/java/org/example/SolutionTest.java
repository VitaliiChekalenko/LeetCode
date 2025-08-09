package org.example;

import com.sun.org.apache.xpath.internal.Arg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParams")
    void testTrueCases(Solution.ListNode list1, Solution.ListNode list2, Solution.ListNode expected) {
        Solution sol = new Solution();

        Assertions.assertEquals(expected, sol.mergeTwoLists(list1, list2));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(new LinkedList<>())
        );
    }

}