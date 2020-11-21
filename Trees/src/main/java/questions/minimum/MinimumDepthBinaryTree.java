package questions.minimum;

import questions.TreeNode;

//problem link : https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class MinimumDepthBinaryTree {

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null && root.right!=null){
            return  minDepth(root.right)+1;
        }
        if(root.left!=null && root.right==null){
            return  minDepth(root.left)+1;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        return Math.min(l,r)+1;
    }
}
