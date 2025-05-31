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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        
        dfs_left(root.left, list1);
        dfs_right(root.right, list2);

        return list1.equals(list2);
    }

    public void dfs_left(TreeNode node, List<Integer> list){
        if(node == null){
            list.add(null);
            return;
        }

        list.add(node.val);
        dfs_left(node.left, list);
        dfs_left(node.right, list);
    }
    public void dfs_right(TreeNode node, List<Integer> list){
        if(node == null){
            list.add(null);
            return;
        }
        
        list.add(node.val);
        dfs_right(node.right, list);
        dfs_right(node.left, list);
    }

}