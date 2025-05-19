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
    int min = Integer.MAX_VALUE;
    int depth;
    void dfs(TreeNode root, int depth){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            min = Math.min(min, depth);
            return;
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0; // testcase 52 input = [] , output = 0 여기에 걸려서 추가해줘야함.
        depth = 0;

        dfs(root, depth + 1);

        return min;
    }
}