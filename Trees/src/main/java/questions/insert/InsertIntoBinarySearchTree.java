package questions.insert;

import questions.TreeNode;

//problem link : https://leetcode.com/problems/insert-into-a-binary-search-tree/
public class InsertIntoBinarySearchTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val, null, null);
            return root;
        }
        insert(root, val);
        return root;
    }

    void insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val,null,null);
            return;
        }
        if (root.val > val) {
            if (root.left == null) {
                TreeNode newNode = new TreeNode(val,null,null);
                root.left = newNode;
                return;
            }
        } else {
            if (root.right == null) {
                TreeNode newNode = new TreeNode(val,null,null);
                root.right = newNode;
                return;
            }
        }

        if (root.val <= val) {
            insert(root.right, val);
        }
        if (root.val > val) {
            insert(root.left, val);
        }
        return;
    }

}
