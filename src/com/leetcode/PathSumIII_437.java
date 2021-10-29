/*Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.
        The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

        Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
        Output: 3
        Explanation: The paths that sum to 8 are shown.

        Example 2:
        Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
        Output: 3

        Constraints:
        The number of nodes in the tree is in the range [0, 1000].
        -109 <= Node.val <= 109
        -1000 <= targetSum <= 1000*/
package com.leetcode;

public class PathSumIII_437 {
    private int pathSum = 0;
    private int duplicate = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        helper(root,targetSum,0);
        return pathSum - duplicate/2;
    }
    private void helper(TreeNode root, int targetSum, int currentSum) {
        if(root == null) return;
        currentSum= currentSum + root.val;
        if(currentSum == targetSum) {
            System.out.println("root is "+root.val);
            pathSum++;
            return;
        }
        helper(root.left,targetSum,currentSum);
        helper(root.right,targetSum,currentSum);
        if(root.val == targetSum) {
            duplicate ++;
        }
        helper(root.left,targetSum,0);
        helper(root.right,targetSum,0);
    }
}