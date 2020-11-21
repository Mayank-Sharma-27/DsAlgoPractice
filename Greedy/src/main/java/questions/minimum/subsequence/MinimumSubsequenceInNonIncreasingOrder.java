package questions.minimum.subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// problem link : https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
public class MinimumSubsequenceInNonIncreasingOrder {

    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ll = new ArrayList();
        Arrays.sort(nums);
        int sum = 0;
        int res=0;
        for(int val : nums){
            sum = sum + val;
        }
        for(int i=nums.length-1;i>=0;i--) {
            res += nums[i];
            sum -= nums[i];
            ll.add(nums[i]);
            if(res>sum) return ll;
        }
        return ll;
    }
}
