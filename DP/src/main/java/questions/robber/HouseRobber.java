package questions.robber;

//problem link : https://leetcode.com/problems/house-robber/
public class HouseRobber {

    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int[] t = new int[n+1];
        t[0] = 0;
        t[1] = nums[0];
        for(int i = 2 ;  i< n+1; i++){
            t[i] = Math.max(t[i-2] + nums[i-1] , t[i-1]);
        }
        return t[n];

    }

}
