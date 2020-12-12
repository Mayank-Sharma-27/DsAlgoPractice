package questions.maximum.size;

//problem link : https://leetcode.com/problems/minimum-size-subarray-sum/
public class MaximumSizeSum {

    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int ans = n;
        int i =0;
        int j =0;
        int sum =0;
        for(int k = 0 ; k < n ;k++){
            sum += nums[k];
        }
        if(sum < s){
            return 0;
        }
        sum =0;
        while( i < n){
            if(sum>= s){
                sum = sum - nums[i];
                ans = Math.min(j-i, ans);
                i++;
            }

            else
            {
                if(j < n){
                    sum = sum+ nums[j];
                    j++;
                }
                else {
                    i++;
                }
            }
        }
        return ans;
    }

}
