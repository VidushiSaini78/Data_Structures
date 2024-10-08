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
       public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Stack<TreeNode> mystack = new Stack<>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                mystack.push(node);  
                node = node.left;    
            } 
            else {
                if (mystack.isEmpty()) break;  

                TreeNode top = mystack.pop();  
                ans.add(top.val);              
                node = top.right;              
            }
        }
        return ans;
    }
}

