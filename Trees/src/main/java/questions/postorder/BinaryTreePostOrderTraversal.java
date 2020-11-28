package questions.postorder;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

//problem link https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(ans, root);
        return ans;
    }
    void solve(List<Integer> ans, TreeNode root){
        if(root==null){
            return ;
        }
        solve(ans, root.left);
        solve(ans, root.right);
        ans.add(root.val);
        return ;
    }

}
