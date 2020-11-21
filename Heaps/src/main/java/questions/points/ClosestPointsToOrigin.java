package questions.points;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//problem link : https://leetcode.com/problems/k-closest-points-to-origin/
public class ClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        Map<Integer, Integer> hm = new HashMap();
        PriorityQueue<Integer>pq=new PriorityQueue(points.length, Collections.reverseOrder(
                (n1,n2) -> hm.get(n1) - hm.get(n2)));
        int n = points.length;

        for(int i=0; i<n; i++){
            int x = points[i][0];
            int y = points[i][1];

            int dist = (int)(Math.pow(x,2) + Math.pow(y,2));

            hm.put(i , dist);
        }
        int[][] ans = new int[K][];
        for(int key : hm.keySet()){
            pq.add(key);

            if(pq.size() > K) pq.poll();
        }
        int start=0;
        while(!pq.isEmpty()){
            ans[start++] = points[pq.poll()];
        }

        return ans;
    }
}
