package questions.delete;

import questions.TreeNode;

// problem link  : https://leetcode.com/problems/delete-leaves-with-a-given-value/
public class DeleteLeavesWithTargetValue {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null){
            return null;
        }
        if(root.left == null && root.right== null){
            if(root.val == target){
                return null;
            }
        }
        return   delete(root, target);

    }

    TreeNode delete(TreeNode root, int target){
        if(root==null){
            return null;
        }
        if(root.val == target){
            if(root.right==null && root.left == null){
                return null;
            }
        }
        root.left =   delete(root.left, target);
        root.right =  delete(root.right, target);
        if(root.left==null && root.right ==null){
            if(root.val==target){
                return null;
            }
        }
        return root;
    }

}
