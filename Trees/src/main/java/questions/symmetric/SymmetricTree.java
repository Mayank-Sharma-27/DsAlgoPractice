package questions.symmetric;

import questions.TreeNode;

// problem link : https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return check_Both(root.left, root.right);

    }

    public static boolean check_Both(TreeNode l, TreeNode r){

        if(l == null && r == null){
            return true;
        }

        if(l == null || r == null){
            return false;
        }

        if(l.val != r.val){
            return false;
        }


        return check_Both(l.left, r.right) && check_Both(l.right, r.left);
    }
}
