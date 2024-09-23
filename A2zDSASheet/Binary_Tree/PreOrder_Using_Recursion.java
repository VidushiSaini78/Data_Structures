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
        List<Integer> ans = new ArrayList<>() ;
        ans = preorder(ans , root);
    return ans;
    }
    static List<Integer> preorder(List<Integer> list1,TreeNode root )
    {
        if(root == null ) return list1 ;
        list1.add(root.val);
        preorder( list1 , root.left) ;
        preorder(list1 , root.right);
    return list1;
    }
}
