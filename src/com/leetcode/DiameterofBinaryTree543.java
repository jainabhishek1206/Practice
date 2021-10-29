package com.leetcode;

public class DiameterofBinaryTree543 {
    public int longestPath = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }

    public int diameter (TreeNode root) {
        if(root == null) return 0;
        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);
        longestPath = Math.max(longestPath,(leftHeight + rightHeight));
        return Math.max(leftHeight,rightHeight)+1;
    }
}
