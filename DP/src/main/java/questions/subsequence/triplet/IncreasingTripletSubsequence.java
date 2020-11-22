package questions.subsequence.triplet;

// link : https://leetcode.com/problems/increasing-triplet-subsequence/
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        if(nums== null || nums.length ==0){
            return false;
        }
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;
        for(int i = 0 ; i< nums.length ; i++){
            if(firstMin > nums[i] && secondMin> nums[i] && thirdMin >nums[i]){
                firstMin = nums[i];
            }
            if(firstMin <  nums[i] && secondMin> nums[i] && thirdMin >nums[i]){
                secondMin = nums[i];
            }

            if(firstMin <  nums[i] && secondMin< nums[i] && thirdMin> nums[i]){
                thirdMin = nums[i];
            }

        }

        if(firstMin!=Integer.MAX_VALUE && thirdMin!=Integer.MAX_VALUE && secondMin!=Integer.MAX_VALUE){
            return true;
        }
        return false;

    }

}
