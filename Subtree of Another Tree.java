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
    public boolean isSubtree(TreeNode root, TreeNode subRoot)
    {
        if(subRoot == null || isSame(root, subRoot))
            return true;
        if(root == null && subRoot != null)
            return false;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

        
    }

    public boolean isSame(TreeNode a, TreeNode b)
    {
        if(a == null && b == null)
            return true;
        if(a == null || b == null)
            return false;
        if(a.val != b.val)
            return false;
        return isSame(a.left, b.left) && isSame(a.right, b.right);
        
    }
}
