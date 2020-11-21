package questions.rotated.sorted.array.search;

// problem link : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchInARotatedSortedArray2 {

    public boolean search(int[] nums, int target) {
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
                start= mid-1;
                end = end-1;
            }
            else if(nums[mid]>nums[end]){
                start =  mid+1;
            }
            else{
                end = mid;
            }
        }

        return find(nums, target, 0,start-1)|| find(nums, target, start, n-1);

    }

    private boolean find(int[] nums, int target, int start , int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]== target){
                return true;
            }
            if(target> nums[mid]){
                start = mid + 1;
            }
            if(target< nums[mid]){
                end = mid - 1;
            }
        }
        return false;
    }

}
