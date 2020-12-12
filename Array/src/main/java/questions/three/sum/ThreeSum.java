package questions.three.sum;

import java.util.*;
import java.util.stream.Collectors;

//problem link : https://leetcode.com/problems/3sum/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i =0;
        while(i < nums.length){
            int  target = -nums[i];
            List<List<Integer>> res = twoSum(nums, target , i);
            for(List list : res){
                list.add(nums[i]);
                Collections.sort(list);
                ans.add(new ArrayList(list));
            }
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) {
                i++;
            }

        }
        return ans.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<List<Integer>> twoSum(int[] nums, int target, int excludeIndex) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList();
        List<List<Integer>> ans = new ArrayList();

        List<Integer> numList= new ArrayList();
        for(int i =0 ; i < nums.length ; i++){
            if(i==excludeIndex){
                continue;
            }
            numList.add(nums[i]);
        }
        for(int i=0 ;i < nums.length ; i++){
            if(i==excludeIndex){
                continue;
            }
            if(map.get(target-nums[i])!=null){
                int req = target - nums[i];
                if(numList.contains(req)){
                    res = new ArrayList();
                    res.add(req);
                    res.add(nums[i]);
                    Collections.sort(res);
                    ans.add(res);
                }
            }
            map.put(nums[i],1);
        }

        return ans.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
