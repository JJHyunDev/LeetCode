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
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
       target = targetSum;
        return dfs(root, 0);
    }

    boolean dfs(TreeNode node, int temp){
        if(node == null) return false;

        if(node.left == null && node.right == null){
            temp += node.val;
            return temp == target;
        }

        boolean left = dfs(node.left, temp + node.val);
        boolean right = dfs(node.right, temp + node.val);        
        return left || right;
    }
}