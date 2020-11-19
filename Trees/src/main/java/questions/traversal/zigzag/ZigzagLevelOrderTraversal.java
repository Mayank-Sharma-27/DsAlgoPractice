package questions.traversal.zigzag;

import questions.TreeNode;

import java.util.*;

// question : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class ZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
        List<List<Integer>> response = new ArrayList();
        int index = 0;
        for (List list : res) {
            if (index % 2 != 0) {
                Collections.reverse(list);
                response.add(list);
            } else {
                response.add(list);
            }
            index++;
        }
        return response;
    }

}
