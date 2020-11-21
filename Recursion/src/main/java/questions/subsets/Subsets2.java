package questions.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// problem link : https://leetcode.com/problems/subsets-ii/
public class Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums==null|| nums.length ==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(output, ans, nums,0);
        return  ans.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    void solve(List<Integer> output,List<List<Integer>> ans, int[] nums , int start){
        ans.add(new ArrayList<>(output));
        if(nums.length==0){
            return;
        }

        List<Integer> output1 = new ArrayList<>(output);
        List<Integer> output2 = new ArrayList<>(output);
        output2.add(new Integer(nums[0]));
        int[] updatedArray = Arrays.copyOfRange(nums, 1, nums.length);
        solve(output1, ans, updatedArray,0);
        solve(output2, ans, updatedArray,0);

        return;
    }

}
