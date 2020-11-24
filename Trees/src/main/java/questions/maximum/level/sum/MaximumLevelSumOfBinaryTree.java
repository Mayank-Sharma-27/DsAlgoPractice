package questions.maximum.level.sum;

import questions.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// problem link : https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
public class MaximumLevelSumOfBinaryTree {

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum =0;
        int level =1;
        int i =0;
        int maxS = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            if(q.peek()==null){
                q.poll();
                i++;
                if(maxS < sum){
                    maxS =  sum;
                    level =i;
                }
                sum =0;

                if(q.peek()==null){
                    break;
                }
            }
            else{
                TreeNode temp = q.poll();
                sum = sum+ temp.val;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                if(q.peek()==null){
                    q.add(null);

                }
            }
        }
        return level;

    }

}
