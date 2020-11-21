package questions.ugly.number;

import java.util.PriorityQueue;

// problem link : https://leetcode.com/problems/super-ugly-number/
public class SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> pq= new PriorityQueue();
        pq.add(1l);
        for(int i =1 ; i < n ; i++){
            long value = pq.poll();
            while(!pq.isEmpty() && pq.peek()==value){
                pq.poll();
            }
            for(int j =0 ; j< primes.length; j++){
                pq.add(value*primes[j]);
            }
        }
        return pq.poll().intValue();
    }

}
