package com.leetcode;

/*Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
        A leaf is a node with no children.

        Example 1:

        Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
        Output: true*/

/*This question is solved*/

public class PathSum112 {
    public static void main(String[] args) {

    }
    public static boolean hasPathSum(treenode root, int targetSum) {
        return hasPathSum(root,targetSum,0);
    }

    public static boolean hasPathSum(treenode root, int targetSum, int achievedSum) {
        achievedSum = achievedSum + root.val;
        boolean res;
        if(achievedSum == targetSum) return true;
        if(root.left!=null) {
            res = hasPathSum(root.left,targetSum,achievedSum);
            if(res == true) return true;
        }
        if(root.right!=null) {
            res = hasPathSum(root.left,targetSum,achievedSum);
            if(res == true) return true;
        }
        return false;
    }
}

class treenode {
    int val;
    treenode left;
    treenode right;

    treenode() {
    }

    treenode(int val) {
        this.val = val;
    }

    treenode(int val, treenode left, treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}