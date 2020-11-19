package questions.traversal;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// problem link : https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/
public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList();
        }
        List<List<Integer>> res = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        q.add(null);
        List<Integer> ans = new ArrayList();
        while(!q.isEmpty()){

            if(q.peek()==null){
                q.poll();
                res.add(new ArrayList(ans));
                ans = new ArrayList();
                if(q.peek()==null){
                    break;
                }
            }
            else{
                TreeNode temp = q.poll();
                ans.add(temp.getVal());
                if(temp.getLeft()!=null){
                    q.add(temp.getLeft());
                }
                if(temp.getRight()!=null){
                    q.add(temp.getRight());
                }
                if(q.peek()==null){
                    q.add(null);
                }
            }
        }
        return res;
    }

}
