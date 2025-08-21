package org.example;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // Якщо це листок — перевіряємо суму
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int newTarget = targetSum - root.val;
        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }
}