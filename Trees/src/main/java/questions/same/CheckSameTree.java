package questions.same;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

//problem link : https://leetcode.com/problems/same-tree/
public class CheckSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();

        fun(p, list1);
        fun(q, list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }

    void fun(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right!=null){
            list.add(null);
        }
        fun(root.left, list);
        fun(root.right, list);
    }

}
