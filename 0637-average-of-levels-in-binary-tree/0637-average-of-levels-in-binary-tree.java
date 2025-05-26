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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return answer;
        }

        q.offer(root);
        while(!q.isEmpty()){
            int iter = q.size();
            double sum = 0;

            for(int i = 0; i < iter; i++){
                TreeNode node = q.remove();
                sum += node.val;

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);                
            }
            answer.add(sum/iter);
        }

        return answer;
    }
}