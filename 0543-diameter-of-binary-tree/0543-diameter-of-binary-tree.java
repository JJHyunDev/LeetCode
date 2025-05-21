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
    int max = 0;
    int dfs(TreeNode node){ // root 노드가 아니라 leaf 노드를 기준으로 접근해야함
        if(node == null){
            return 0;
        }

        int left = dfs(node.left);    
        int right = dfs(node.right);

        max = Math.max(max, (left + right));

        return Math.max(left, right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);

        return max;
    }
}