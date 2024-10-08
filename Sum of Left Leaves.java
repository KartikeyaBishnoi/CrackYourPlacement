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
    public int sumOfLeftLeaves(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int sum = 0;

        while(!que.isEmpty())
        {
            TreeNode node = que.remove();
            if(node.left != null)
            {
                if(node.left.left == null && node.left.right == null)
                    sum += node.left.val;
                que.add(node.left);
            }
            if(node.right != null)
            {
                que.add(node.right);
            }
        }
        return sum;
        
    }
}
