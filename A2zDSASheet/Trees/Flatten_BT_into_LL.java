class Solution {
    public void flatten(TreeNode root) {
        if (root == null)
            return;

        // If left subtree is null, no need to flatten
        if (root.left == null) {
            flatten(root.right);
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right ;
        root.right = root.left;
        root.left = null;
        TreeNode tail = root;
        while(tail.right !=null)
        {
            tail = tail.right;

        }
        if(temp != null)
        tail.right = temp;
    }
     
}
