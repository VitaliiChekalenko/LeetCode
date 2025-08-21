package org.example;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        int sum = 0;
        TreeNode firstNode = root;
        TreeNode currentNode = new TreeNode();

        while (sum != targetSum || currentNode != firstNode ) {
            if (firstNode.left != null) {
                sum = firstNode.val + firstNode.left.val;
                firstNode = firstNode.left;
            } else {
                firstNode =
            }
        }
        
    }
}