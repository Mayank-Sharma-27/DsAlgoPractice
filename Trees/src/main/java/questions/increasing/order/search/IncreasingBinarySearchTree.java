package questions.increasing.order.search;

import questions.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//problem link : https://leetcode.com/problems/increasing-order-search-tree/
public class IncreasingBinarySearchTree {
    public TreeNode increasingBST(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        dfs(q, root);
        TreeNode ans = q.poll();
        TreeNode start = ans;
        while(!q.isEmpty()){
            TreeNode currNode = q.poll();
            ans.right = currNode;
            ans.left= null;
            ans = currNode;
        }
        return start;
    }

    void dfs(Queue<TreeNode> t, TreeNode root)
    {
        if(root==null){
            return;
        }

        if(root.left== null && root.right == null){
            t.offer(root);
            return;
        }
        dfs(t, root.left);
        t.offer(root);
        dfs(t,root.right);
    }
}
