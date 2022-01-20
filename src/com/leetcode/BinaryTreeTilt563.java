package com.leetcode;

public class BinaryTreeTilt563 {
    int totalTilt = 0;
    public int findTilt(TreeNode root) {
        return totalTilt;
    }
    public void postzOrderTransversal(TreeNode root) {
        if(root == null) return;
        postzOrderTransversal(root.left);
        postzOrderTransversal(root.right);
        int left = 0, right = 0;
        if(root.left!=null)

    }

}
