package questions.two.sum;

import java.util.HashMap;
import java.util.Map;

//problem link : https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int ans1=0;

        for(int i=0 ;i < nums.length ; i++){

            if(map.get(target-nums[i])!=null){
                ans[0]=i;
                ans1 = target - nums[i];
                break;
            }
            map.put(nums[i],1);
        }

        for(int i =0 ;i < nums.length ; i++){
            if(ans1==nums[i] && i != ans[0]){
                ans[1] =i;
                break;
            }
        }
        return ans;
    }
}
