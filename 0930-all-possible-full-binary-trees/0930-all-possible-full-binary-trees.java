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
    private Map<Integer, List<TreeNode>> memo = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        List<TreeNode> result = new ArrayList<>();

        if(n == 1) {
            result.add(new TreeNode(0));

            memo.put(n, result);
            return result;
        }

        if(n % 2 == 0) {
            memo.put(n, result);
            return result;
        }

        for(int i = 1; i < n; i += 2) {
            int leftNodes = i;
            int rightNodes = n - 1 - i;

            List<TreeNode> leftSubtree = allPossibleFBT(leftNodes);
            List<TreeNode> rightSubtree = allPossibleFBT(rightNodes);

            for(TreeNode left : leftSubtree) {
                for(TreeNode right : rightSubtree) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }

        memo.put(n, result);
        return result;
    }
}