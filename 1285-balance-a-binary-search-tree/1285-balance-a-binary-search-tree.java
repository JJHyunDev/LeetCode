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
    List<Integer> sortedValues = new ArrayList<>();
     
    public TreeNode balanceBST(TreeNode root) {
        inOrderTraversal(root);

        return dfs(0, sortedValues.size() - 1);
    }

    public void inOrderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }

        inOrderTraversal(node.left);
        sortedValues.add(node.val);
        inOrderTraversal(node.right);
    }

    public TreeNode dfs(int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(sortedValues.get(mid));

        root.left = dfs(start, mid - 1);
        root.right = dfs(mid + 1, end);

        return root;
    }
}