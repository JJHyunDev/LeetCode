/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root, null, null);
    }

    public int dfs(TreeNode node, TreeNode parent, TreeNode grandParent) {
        if(node == null) {
            return 0;
        }

        int currentSum = 0;

        if(grandParent != null && grandParent.val % 2 == 0) {
            currentSum += node.val;
        }

        int leftSum = dfs(node.left, node, parent);
        int rightSum = dfs(node.right, node, parent);

        return currentSum + leftSum + rightSum;
    }
}