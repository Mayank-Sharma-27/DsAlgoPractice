package questions.third.maximum;

//problem link : https://leetcode.com/problems/third-maximum-number/
public class ThirdMaximum {

    public int thirdMax(int[] nums) {
        int n = nums.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean isThirdPresent= false;
        for(int i =0; i < n ; i++){
            if(nums[i]> first){
                first = nums[i];
            }
        }
        for(int i =0; i < n ; i++){
            if(nums[i]> second && nums[i] < first){
                second = nums[i];
            }
        }

        for(int i =0; i < n ; i++){
            if(nums[i]>= third && nums[i] < second){
                third = nums[i];
                isThirdPresent = true;
            }
        }

        if(isThirdPresent){
            return third;
        }
        return first;

    }

}
