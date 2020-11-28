package questions.inorder;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

//problem link : https://leetcode.com/problems/binary-tree-inorder-traversal/
public class InorderTraversalOfBinaryTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(ans, root);
        return ans;
    }
    void solve(List<Integer> ans, TreeNode root){
        if(root==null){
            return ;
        }
        solve(ans, root.left);
        ans.add(root.val);
        solve(ans, root.right);
        return ;
    }

}
