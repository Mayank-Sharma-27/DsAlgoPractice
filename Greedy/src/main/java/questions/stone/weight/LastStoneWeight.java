package questions.stone.weight;

import java.util.Collections;
import java.util.PriorityQueue;

// problem link : https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) pq.add(stone);
        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            int res = y-x;
            if(res!=0){
                pq.add(res);
            }

        }
        if(pq.size() == 0) return 0;
        return pq.poll();
    }

}
