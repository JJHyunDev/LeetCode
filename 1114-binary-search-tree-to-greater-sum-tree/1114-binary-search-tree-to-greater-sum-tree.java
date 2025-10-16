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
    private int cumulativeSum = 0;

    public TreeNode bstToGst(TreeNode root) {
        reverseInOrderTraversal(root);
        return root;
    }

    private void reverseInOrderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }

        reverseInOrderTraversal(node.right);
        cumulativeSum += node.val;
        node.val = cumulativeSum;
        reverseInOrderTraversal(node.left);
    }
}