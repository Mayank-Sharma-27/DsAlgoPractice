package questions.balanced;

import questions.TreeNode;

//problem link : https://leetcode.com/problems/balanced-binary-tree/
public class CheckIfBalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int l = height(root.left);
        int r = height(root.right);


        if(l-r>1){
            return false;
        }
        if(r-l>1){
            return false;
        }
        return isBalanced(root.left)&& isBalanced(root.right);

    }

    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l  = height(root.left)+1;
        int r = height(root.right) +1;
        return Math.max(l,r);
    }
}
