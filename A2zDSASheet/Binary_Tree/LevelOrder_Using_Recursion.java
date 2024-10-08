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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans; 
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i=0 ; i<size ; i++)
            {
                
                TreeNode current = queue.poll();
                sublist.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            ans.add(sublist);
        }
    return ans;

    }
}
