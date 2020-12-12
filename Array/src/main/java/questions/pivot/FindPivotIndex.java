package questions.pivot;

//problem link : https://leetcode.com/problems/find-pivot-index/
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for(int i = 0 ;i < nums.length; i++){ totalSum
                += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            totalSum -= nums[i];
            if(leftSum == totalSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

}
