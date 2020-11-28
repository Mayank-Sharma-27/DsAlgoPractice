package questions.preorder;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

// problem link https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(ans, root);
        return ans;
    }
    void solve(List<Integer> ans, TreeNode root){
        if(root==null){
            return ;
        }
        ans.add(root.val);
        solve(ans, root.left);
        solve(ans, root.right);
        return ;
    }
}
