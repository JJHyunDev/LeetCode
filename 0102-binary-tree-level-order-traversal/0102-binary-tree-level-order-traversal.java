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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return answer;
        }

        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int iter = q.size();
            
            for(int i = 0; i < iter; i++) {
                TreeNode node = q.remove();
            
                list.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            answer.add(list);            
        }

        return answer;
    }
}