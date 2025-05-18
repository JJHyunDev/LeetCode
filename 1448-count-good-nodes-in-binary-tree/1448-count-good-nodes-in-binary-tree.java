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
    int answer;
    int max;
    void dfs(TreeNode node, int max){
        if(node == null){
            return;
        }
        
        if(node.val >= max) answer++;
        max = Math.max(max, node.val);
                    
        dfs(node.left, max);
        dfs(node.right, max);
    }

    public int goodNodes(TreeNode root) {
        answer = 0;
        max = root.val;

        dfs(root, max);

        return answer;
    }
}