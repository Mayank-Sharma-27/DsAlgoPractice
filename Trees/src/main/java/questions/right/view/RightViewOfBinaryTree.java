package questions.right.view;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//  problem link : https://leetcode.com/problems/binary-tree-right-side-view/
public class RightViewOfBinaryTree {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList();
        }
        List<List<Integer>> res = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        q.add(null);
        List<Integer> ans = new ArrayList();
        while (!q.isEmpty()) {

            if (q.peek() == null) {
                q.poll();
                res.add(new ArrayList(ans));
                ans = new ArrayList();
                if (q.peek() == null) {
                    break;
                }
            } else {
                TreeNode temp = q.poll();
                ans.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                if (q.peek() == null) {
                    q.add(null);
                }
            }
        }
        List<Integer> response = new ArrayList();

        for (List list : res) {
            int size = list.size();
            Integer value = (Integer) list.get(size - 1);
            response.add(value);
        }
        return response;
    }

}
