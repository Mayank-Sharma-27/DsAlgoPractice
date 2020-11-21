package questions.maximum.binary.tree;

import questions.TreeNode;

// problem : https://leetcode.com/problems/maximum-binary-tree/
public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length==0){
            return null;
        }
        return solve(nums, 0, nums.length-1);


    }

    TreeNode solve(int[] nums, int start, int end){
        if(  end ==  -1 ||  start > end){
            return null;
        }

        int index = findMaxArrayValueIndex(nums, start, end);
        TreeNode  root =new TreeNode();
        root.val = nums[index];
        root.left = solve(nums , start, index-1);
        root.right = solve(nums, index+1, end);
        return root;

    }

    int  findMaxArrayValueIndex(int[] nums, int start, int end){
        int max = nums[start];
        int  index =start;
        for (int i = start; i <= end; i++)
            if (nums[i] > max)
            {    max = nums[i];
                index=i;
            }
        return index;
    }
}
