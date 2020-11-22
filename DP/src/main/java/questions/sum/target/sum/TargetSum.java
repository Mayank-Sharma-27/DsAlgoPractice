package questions.sum.target.sum;

// problem link : https://leetcode.com/problems/target-sum/
public class TargetSum {

    public int findTargetSumWays(int[] nums, int S) {
        int totalSum = 0;
        for(int i=0;i<nums.length;i++) {
            totalSum = totalSum + nums[i];
        }
        if(totalSum < S || (totalSum + S)%2 != 0)
            return 0;
        int sum = (totalSum + S)/2;
        int [][] dp = new int [nums.length + 1][sum +1];
        for(int j=0;j<dp[0].length;j++)
            dp[0][j] = 0;
        dp[0][0] = 1;
        for(int i=1;i < dp.length;i++) {
            for(int j=0;j < dp[0].length;j++) {
                if(j< nums[i-1])
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
            }
        }
        return dp[nums.length][sum];
    }

}
