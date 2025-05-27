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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        dfs(root, targetSum, list, answer);
        return answer;
    }
    
    public void dfs(TreeNode node, int targetSum, List<Integer> list, List<List<Integer>> answer){
        if(node == null){
            return;
        }

        list.add(node.val); // list에 우선 해당 노드 val 저장

        if(node.left == null && node.right == null && targetSum - node.val == 0){ // 리프노드에서 targetSum - node.val == 0이 되면
            answer.add(new ArrayList<>(list));         // answer 에 해당 리프 노드까지의 경로가 담긴 list를 복사해 저장
        }else{
            dfs(node.left, targetSum - node.val, list, answer); // targetSum - node.val를 넘겨준다.
            dfs(node.right, targetSum - node.val, list, answer);    
        }

        list.remove(list.size()-1); // list 하나를 공유해서 사용하기 때문에 이 전 호출로 돌아갈 때 마지막 요소를 remove 해준다.
    }
}