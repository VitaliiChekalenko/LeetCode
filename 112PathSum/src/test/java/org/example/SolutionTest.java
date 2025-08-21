package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution sol = new Solution();

    @Test
    void returnsFalse_whenTreeIsNull() {
        assertFalse(sol.hasPathSum(null, 10));
    }

    @Test
    void singleNode_trueWhenValueEqualsTarget() {
        TreeNode root = new TreeNode(7);
        assertTrue(sol.hasPathSum(root, 7));
    }

    @Test
    void singleNode_falseWhenValueNotEqualsTarget() {
        TreeNode root = new TreeNode(7);
        assertFalse(sol.hasPathSum(root, 8));
    }

    @Test
    void example_trueCase() {
        // Дерево:
        //       5
        //      / \
        //     4   8
        //    /   / \
        //  11   13  4
        //  / \
        // 7   2
        TreeNode root =
                node(5,
                        node(4,
                                node(11, node(7), node(2)),
                                null),
                        node(8,
                                node(13),
                                node(4)));

        assertTrue(sol.hasPathSum(root, 22)); // 5->4->11->2
    }

    @Test
    void example_falseCase() {
        TreeNode root =
                node(5,
                        node(4,
                                node(11, node(7), node(2)),
                                null),
                        node(8,
                                node(13),
                                node(4)));
        assertFalse(sol.hasPathSum(root, 26)); // жоден шлях не дає 26
    }

    @Test
    void worksWithNegativeValues() {
        //    -2
        //      \
        //      -3
        TreeNode root = node(-2, null, node(-3));
        assertTrue(sol.hasPathSum(root, -5)); // -2 + -3 = -5
        assertFalse(sol.hasPathSum(root, -2));
    }

    // ---------- helpers ----------
    private static TreeNode node(int v) { return new TreeNode(v); }
    private static TreeNode node(int v, TreeNode l, TreeNode r) { return new TreeNode(v, l, r); }
}