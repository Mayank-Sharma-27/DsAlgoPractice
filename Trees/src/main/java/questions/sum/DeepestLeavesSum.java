package questions.sum;

import questions.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class DeepestLeavesSum {

    int maxLevelSum;
    int maxLevel;
    Map<Integer, Integer> map = new HashMap();
    public DeepestLeavesSum(){
        this.maxLevel = 0;
        this.maxLevelSum = 0;
    }
    public int deepestLeavesSum(TreeNode root) {
        solve(root, 0);
        return maxLevelSum;
    }

    void solve(TreeNode root, int level){
        if(root==null){
            return;
        }

        if(root.left == null && root.right == null){
            if(map.get(level)!=null){
                int value = map.get(level) + root.val;
                map.put(level, value);

            }
            else{
                map.put(level, root.val);
            }
            if(level >= maxLevel){
                maxLevel = level;
                maxLevelSum = map.get(level);
            }
        }
        solve(root.left , level +1);
        solve(root.right , level +1);
    }

}
