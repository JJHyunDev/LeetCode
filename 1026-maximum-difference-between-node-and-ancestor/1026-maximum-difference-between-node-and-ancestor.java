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
    int dfs(TreeNode node, int max, int min){
        if(node == null){
            return max - min;
        }

        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        return Math.max(dfs(node.left, max, min), dfs(node.right, max, min));
    }
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }
}