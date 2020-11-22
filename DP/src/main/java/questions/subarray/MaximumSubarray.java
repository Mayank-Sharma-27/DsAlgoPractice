package questions.subarray;

// problem link : https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int[] t = new int[n];
        t[0] = nums[0];
        int max = t[0];
        int sum = 0;
        for(int i =1 ; i <n ; i++){
            sum = nums[i] + t[i-1];
            t[i] = Math.max(nums[i], sum);
            max = Math.max(t[i], max);
        }
        return max;
    }

}
