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
    int answer = 0;
    public int averageOfSubtree(TreeNode root) {
        
        dfs(root);
        return answer;
    }

    public int[] dfs(TreeNode node) {
        if(node == null) {
            return new int[]{0, 0};
        }

        int[] leftSubtree = dfs(node.left);
        int[] rightSubtree = dfs(node.right);

        int currentSum = leftSubtree[0] + rightSubtree[0] + node.val;
        int currentCount = leftSubtree[1] + rightSubtree[1] + 1;

        int average = currentSum / currentCount; 

        if(node.val == average) {
            answer++;
        }

        return new int[]{currentSum, currentCount};
    }
}