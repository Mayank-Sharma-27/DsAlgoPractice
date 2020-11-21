package questions.rotated.sorted.array.minimum;

// problem link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class MinimumRotatedArray2 {

    public int findMin(int[] nums) {
        int n = nums.length;
        int start =0;
        int end =n-1;
        while(start< end){
            int mid = start + (end-start)/2;
            if(start<0|| end<0){
                start=0;
                break;
            }
            if(nums[mid] == nums[end]){
                start = mid-1;
                end = end-1;
            }
            else if(nums[mid]>nums[end]){
                start =  mid+1;
            }
            else{
                end = mid;
            }


        }

        if(start==0){
            return nums[start];
        }
        return Math.min(nums[start],nums[start-1]);

    }

}
