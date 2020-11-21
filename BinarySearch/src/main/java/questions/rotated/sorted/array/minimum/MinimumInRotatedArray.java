package questions.rotated.sorted.array.minimum;

// problem link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinimumInRotatedArray {

    public int findMin(int[] nums) {

        int n =nums.length;
        if(nums==null || n==0){
            return 0;
        }
        int    start = 0;
        int  end = n - 1;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return  Math.min(nums[0], nums[1]);
        }
        int index=0;
        while(start< end){
            int mid = start + (end-start)/2;
            if(nums[mid]> nums[end]){
                start =  mid+1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];
    }
}
