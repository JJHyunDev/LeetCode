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
    private int sum = 0;
    private int lowNum;
    private int highNum;

    public int rangeSumBST(TreeNode root, int low, int high) {
        lowNum = low;
        highNum = high;
        dfs(root);

        return sum;
    }

    public void dfs(TreeNode node) {
        if(node == null) {
            return;
        }

        dfs(node.left);
        if(node.val >= lowNum && node.val <= highNum) {
            sum += node.val;
        }
        dfs(node.right);
    }
}