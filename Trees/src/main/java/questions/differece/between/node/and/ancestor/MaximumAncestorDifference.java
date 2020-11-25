package questions.differece.between.node.and.ancestor;

import questions.TreeNode;

//problem link : https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
public class MaximumAncestorDifference {
    int maxD =0;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
        int minL = root.val;
        int maxR = root.val;
        solve(root, minL , maxR);
        return maxD;
    }

    void solve(TreeNode root, int minL, int maxR){
        if(root==null){
            return;
        }
        minL = Math.min(minL, root.val);
        maxR = Math.max(maxR, root.val);

        solve(root.left, minL, maxR);
        solve(root.right, minL, maxR);

        maxD = Math.max(Math.max(root.val - minL,  maxR - root.val), maxD);
        return;
    }

}
