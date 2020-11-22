package questions.sum.equal.sum;

//problem link : https://leetcode.com/problems/partition-equal-subset-sum/
public class PartitionEqualSum {

    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int sum =0;
        for(int i =0 ; i< n ; i++){
            sum = sum+ nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        sum = sum/2;
        boolean t[][]  =new boolean [n+1][sum+1];
        for(int i = 0 ;i < n+1 ;  i++){
            t[i][0] = true;
        }

        return isSubset(t,sum,n,nums);
    }

    boolean isSubset(boolean t[][] , int sum , int n, int[] nums){

        for(int i =1 ; i< n+1 ; i++){
            for(int j =1; j< sum+1; j++){
                if(nums[i-1]<=j){
                    t[i][j] = t[i-1][j - nums[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];

    }

}
