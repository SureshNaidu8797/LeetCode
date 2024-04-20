/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    int dfs(TreeNode root, int numTillNow) {
        if (root == null)
            return 0;
        numTillNow = numTillNow * 10 + root.val;
        if (root.left == null && root.right == null) {
            return numTillNow;
        }
        return dfs(root.left, numTillNow) + dfs(root.right, numTillNow);
    }
}