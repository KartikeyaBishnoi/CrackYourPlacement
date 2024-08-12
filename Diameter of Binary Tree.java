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
class Solution
{
    int res;
    public int diameterOfBinaryTree(TreeNode root)
    {
        res = Integer.MIN_VALUE;
        int x = dfs(root);
        return res;       
    }

    public int dfs(TreeNode node)
    {
        if(node == null)
            return 0;
        int lh = dfs(node.left);
        int rh = dfs(node.right);
        int dia = lh + rh;

        if(dia > res)
            res = dia;
        return Math.max(lh,rh) + 1;
    }
}
