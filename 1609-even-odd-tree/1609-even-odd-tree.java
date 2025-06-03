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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean answer = false;

        q.offer(root);
        boolean isOdd = false;
        while(!q.isEmpty()){
            int iter = q.size();

            int num = isOdd ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            for(int i = 0; i < iter; i++){
                TreeNode node = q.remove();

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);

                if(isOdd){
                    if(node.val % 2 == 0 && node.val < num) answer = true;
                    else return false;
                } else {
                    if(node.val % 2 != 0 && node.val > num) answer = true;
                    else return false;
                }
                num = node.val;
            }
            isOdd = !isOdd;
        }

        return answer;
    }
}