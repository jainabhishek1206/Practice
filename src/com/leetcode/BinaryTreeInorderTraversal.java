package com.leetcode;


import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(treenode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(root.val);

        return arrayList;
    }
}

/*Definition for a binary tree node.*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}