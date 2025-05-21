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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // 큐에 root 넣어주고 

        while(!queue.isEmpty()){  // 큐가 비어있지 않다면
            int iter = queue.size(); // 큐 사이즈 만큼 반복, 아래쪽에서 큐를 계속 채워준다.

            for(int i = 0; i < iter; i++){
                TreeNode node = queue.remove();

                if(i == 0) {
                    list.add(node.val);
                }

                if(node.right != null){ // node.right 부터 넣기 때문에 i == 0 일 때 가장 오른 쪽 노드를 가리킨다.
                    queue.offer(node.right);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
            }
        }

        return list;
    }
}