package questions.range.sum;

// problem link : https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQuery {

    int[] sum;
    public void NumArray(int[] nums) {
        int n = nums.length;
        if(nums==null ||n == 0) return;
        sum = new int[n];
        sum[0]=nums[0];
        for(int i =1 ;i<n ;i++){
            sum[i] = sum[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) return sum[j];
        return sum[j]-sum[i-1];
    }

}
