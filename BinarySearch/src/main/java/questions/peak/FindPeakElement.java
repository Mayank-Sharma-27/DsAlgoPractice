package questions.peak;

// problem link : https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }

        int start =0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid>0 && mid< n-1){
                if(nums[mid]> nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
            }
            if(mid ==0){
                if(nums[0]<nums[1]){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            if(mid==n-1){
                if(nums[n-1]> nums[n-2]){
                    return n-1;
                }
                else{
                    return n-2;
                }
            }
            else if(nums[mid+1]>nums[mid]){
                start = mid +1;
            }
            else{
                end  = mid-1;
            }
        }
        return -1;
    }

}
