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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int answer = 0;
        int currLevel = 1;
        int max = Integer.MIN_VALUE;

        q.offer(root);
        while(!q.isEmpty()){
            int iter = q.size();
            int sum = 0;
            
            for(int i = 0; i < iter; i++){
                TreeNode node = q.remove();

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                
                sum += node.val;
            }

            if(sum > max){
                answer = currLevel;
                max = sum;
            }

            currLevel++;
        }

        return answer;
    }
}