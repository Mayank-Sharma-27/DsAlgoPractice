package questions.k.largest.element;

import java.util.PriorityQueue;

// problem link : https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        int n = nums.length;
        for(int i =0 ; i< n ; i++){
            int value = nums[i];
            pq.add(value);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}
