package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getParamsTrue")
    void testCheckTreeTrue(TreeNode root) {
        Solution solution = new Solution();

        assertTrue(solution.checkTree(root));
    }

    @ParameterizedTest
    @MethodSource("getParamsFalse")
    void testCheckTreeFalse(TreeNode root) {
        Solution solution = new Solution();

        assertFalse(solution.checkTree(root));
    }

    static Stream<Arguments> getParamsTrue() {
        return Stream.of(
                Arguments.of( new TreeNode(10, new TreeNode(4), new TreeNode(6))),
                Arguments.of(new TreeNode(5, new TreeNode(4), new TreeNode(1))),
                Arguments.of(new TreeNode(2, new TreeNode(1), new TreeNode(1)))
        );
    }

    static Stream<Arguments> getParamsFalse() {
        return Stream.of(
                Arguments.of( new TreeNode(10, new TreeNode(3), new TreeNode(6))),
                Arguments.of(new TreeNode(5, new TreeNode(3), new TreeNode(1))),
                Arguments.of(new TreeNode(2, new TreeNode(5), new TreeNode(1)))
        );
    }
}