package questions.k.top.frequent.numbers;

import java.util.*;

// problem link : https://leetcode.com/problems/top-k-frequent-words/
public class TopFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap();
        PriorityQueue<String> pq = new PriorityQueue<>(words.length, (a, b) -> map.get(a) == map.get(b) ? b.compareTo(a) : map.get(a) - map.get(b));

        int n = words.length;
        for(int i =0   ;  i < n ; i++){
            if(map.get(words[i])==null){
                map.put(words[i],1);
            }
            else{
                int value = map.get(words[i]);
                value++;
                map.put(words[i],value);
            }
        }
        for(String key : map.keySet()){
            pq.add(key);
            if(pq.size()> k){
                pq.poll();
            }
        }
        List<String> ans = new ArrayList();
        while(pq.size()>0){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;

    }
}
