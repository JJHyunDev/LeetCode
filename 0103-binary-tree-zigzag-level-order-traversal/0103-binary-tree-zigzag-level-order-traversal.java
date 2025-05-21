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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int num = 0;

        if(root == null){
            return answer;
        }
        
        q.offer(root);
        while(!q.isEmpty()){
            int iter = q.size(); // 계층 사이즈만큼 반복
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < iter; i++){
                TreeNode node = q.remove();
                list.add(node.val);    
                
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }

            if(num % 2 != 0){ // 홀수 계층에서 뒤집어주기
                Collections.reverse(list);
            }
            answer.add(list);
            num++;
        }

        return answer;
    }
}