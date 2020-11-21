package questions.sort.characters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// problem link : https://leetcode.com/problems/sort-characters-by-frequency/
public class SortCharacters {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap();
        PriorityQueue<Character> pq=new PriorityQueue(Collections.reverseOrder(
                (n1,n2) -> map.get(n1) - map.get(n2)));
        int length = s.length();
        for(int i =0 ; i< length ; i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }
            else{
                int value = map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i),value);
            }
        }

        for(char key : map.keySet()){
            pq.add(key);
        }

        StringBuilder str
                = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            int value = map.get(c);
            while(value>0){
                str.append(c);
                value--;
            }
        }
        return str.toString();
    }

}
