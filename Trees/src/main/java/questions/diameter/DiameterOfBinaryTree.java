package questions.diameter;


import questions.TreeNode;

// problem link : https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBinaryTree {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        if(res==0){
            return 0;
        }
        return res-1;
    }
    int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = solve(root.left);
        int r = solve(root.right);

        int temp = Math.max(l,r)+1;
        int ans = Math.max(temp, l+r+1);
        res = Math.max(res, ans);
        return temp;
    }

}
