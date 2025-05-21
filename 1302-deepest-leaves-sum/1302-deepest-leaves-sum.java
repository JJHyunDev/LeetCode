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
    public int deepestLeavesSum(TreeNode root) {
        int answer = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int iter = q.size();
            answer = 0; // answer = 0 으로 초기화

            for(int i = 0; i < iter; i++){
                TreeNode node = q.remove();
                answer += node.val; // 현재 층(?)의 node.val 합을 구함, 다음 층으로 내려가면 0으로 초기화
                                    // 항상 가장 마지막 노드의 합을 가지게 된다.
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }

        return answer;
    }
}