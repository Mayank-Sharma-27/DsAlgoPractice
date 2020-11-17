package main.java;


public class TreeNode {
    public int val;
    public TreeNode left;

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode right;

    public int getVal() {
        return val;
    }

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
