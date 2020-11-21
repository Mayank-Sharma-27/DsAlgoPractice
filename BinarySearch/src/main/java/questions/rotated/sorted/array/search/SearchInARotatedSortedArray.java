package questions.rotated.sorted.array.search;

// problem link : https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInARotatedSortedArray {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n ==0){
            return -1;
        }
        if(n==1){
            if(nums[0]==target){
                return 0;
            }
        }
        int start =0;
        int end =n-1;
        if(n==2){
            if(nums[0] == target){
                return 0;
            }
            if(nums[1]==target){
                return 1;
            }
            return -1;
        }
        int index =0;
        while(start< end){
            int mid = start + (end-start)/2;
            if(nums[mid]> nums[end]){
                start =  mid+1;
            }
            else{
                end = mid;
            }
        }

        return Math.max(find(nums, target, 0,start-1), find(nums, target, start, n-1));

    }

    private int find(int[] nums, int target, int start , int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]== target){
                return mid;
            }
            if(target> nums[mid]){
                start = mid + 1;
            }
            if(target< nums[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }

}
