package questions.frequent.elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// problem link : https://leetcode.com/problems/top-k-frequent-elements/
public class SortKElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int n = nums.length;
        for(int i =0 ;i< n ; i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }
            else{
                int  value = map.get(nums[i]);
                value++;
                map.put(nums[i],value);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue((n1, n2) -> map.get(n1) - map.get(n2));
        int[] ans = new int[k];


        for(int i: map.keySet()){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int i =0;
        while(pq.size()>0){
            ans[i] = pq.poll();
            i++;
        }
        return ans;
    }
}
