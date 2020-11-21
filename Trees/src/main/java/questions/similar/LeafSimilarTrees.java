package questions.similar;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

//problem link : https://leetcode.com/problems/leaf-similar-trees/
public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        fun(root1, list1);
        fun(root2, list2);
        if(list1.equals(list2)){
            return true;
        }        return false;

    }
    void fun(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        fun(root.left, list);
        fun(root.right, list);
    }
}
