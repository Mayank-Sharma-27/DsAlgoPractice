package maximuum.path.sum;

import main.java.TreeNode;

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
        int l = solve(root.left);
        int r = solve(root.right);

        int temp = Math.max(Math.max(r, l) + root.val, root.val);
        int ans = Math.max(temp, l + r + root.val);
        res = Math.max(ans, res);
        return temp;
    }

}
