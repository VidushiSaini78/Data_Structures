/*
You will be given a binary tree and a target sum, 
you have to print all the paths from the root to the leaf nodes whose sum is equal to the given target sum.
*/
static void finding(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans, int targetSum) {
        if (root == null)
            return;

        path.add(root.val);

        if (targetSum == root.val && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        } else {
            finding(root.left, path, ans, targetSum - root.val);
            finding(root.right, path, ans, targetSum - root.val);
        }

        path.remove(path.size() - 1);
}
