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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans  = new ArrayList<>();
        if(root == null) return ans;
        Stack<TreeNode> mystack = new Stack<>();
        mystack.push(root);
        while(!mystack.isEmpty())
        {
            TreeNode top_node = mystack.pop();
            ans.add(top_node.val);
            if(top_node.right != null) mystack.push(top_node.right);
            if(top_node.left != null) mystack.push(top_node.left);
        }
    return ans ; 

    }
}
