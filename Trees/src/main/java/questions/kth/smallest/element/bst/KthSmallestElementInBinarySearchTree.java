package questions.kth.smallest.element.bst;

import questions.TreeNode;

//problem link : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElementInBinarySearchTree {

    int min = Integer.MAX_VALUE;
    int target =0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        solve(root, k);
        return min;
    }

    void solve(TreeNode root,  int k){
        if(root==null){
            return;
        }

        solve(root.left, k);
        target++;
        if(target==k){
            min = root.val;
            return;
        }
        solve(root.right,k);

        return ;
    }

}
