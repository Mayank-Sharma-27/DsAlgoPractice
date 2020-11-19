package questions.sum;


import questions.TreeNode;

// problem link : https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class FindMaximumPathSum {
    int res = -1001;

    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
    }

    int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = solve(root.getLeft());
        int r = solve(root.getRight());

        int temp = Math.max(Math.max(r, l) + root.getVal(), root.getVal());
        int ans = Math.max(temp, l + r + root.getVal());
        res = Math.max(ans, res);
        return temp;
    }

}
