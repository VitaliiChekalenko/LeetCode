package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List <Integer> a = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null){
            inorderTraversal(root.left);
            a.add(root.val);
            inorderTraversal(root.right);
        }
        return a;
    }
}