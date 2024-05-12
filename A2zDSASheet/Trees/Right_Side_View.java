class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        getView(root , 0 , ans);
        return ans;
    }
    static void getView(TreeNode root , int level,List<Integer> rightView)
    {
        
        if(root ==null) return ;
        if(level == rightView.size()) rightView.add(root.val);
        getView(root.right , level+1 , rightView);
        getView(root.left , level+1 , rightView);
        
    } 
}
