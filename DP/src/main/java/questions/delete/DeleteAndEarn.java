package questions.delete;

// problem link : https://leetcode.com/problems/delete-and-earn/
public class DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        int max  =0;
        for (int num: nums) {
            max = Math.max(max, num);
        }
        int[] count = new int[max+1];
        for (int num: nums) {
            count[num]++;
        }
        int[] dp = new int[max+1];
        dp[0] = 0;
        dp[1] = 1*count[1];
        for(int i= 2 ; i< max+1 ; i++){
            dp[i] =  Math.max(count[i]*i+ dp[i-2], dp[i-1]);
        }
        return dp[max];
    }


}
