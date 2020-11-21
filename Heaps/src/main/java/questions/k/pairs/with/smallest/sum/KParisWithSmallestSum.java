package questions.k.pairs.with.smallest.sum;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// problem link : https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
public class KParisWithSmallestSum {

    class Pair{
        int i;
        int j ;
        int sum;

        Pair (int i, int j) {
            this.i = i;
            this.j = j;
            this.sum = i+j;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(   (n1, n2) -> n1.sum - n2.sum);

        for(int p=0 ; p < nums1.length ; p++){
            for(int q=0 ; q< nums2.length; q++){

                Pair pair = new Pair(nums1[p],nums2[q]);
                pq.add(pair);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        while(!pq.isEmpty() && k-- >0){
            Pair pair = pq.poll();
            List<Integer> res = new ArrayList<>();
            res.add(pair.i);
            res.add(pair.j);
            ans.add(res);


        }
        return ans;
    }

}
