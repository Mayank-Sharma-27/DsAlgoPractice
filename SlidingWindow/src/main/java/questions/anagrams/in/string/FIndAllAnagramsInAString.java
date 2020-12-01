package questions.anagrams.in.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//problem link : https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FIndAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int k = p.length();
        int n = s.length();
        int i =0;
        int j =0;
        int tempCount = 0;
            Map<Character, Integer> map = new HashMap<>();
        for(int l =0; l< k ; l++){
            if(map.get(p.charAt(l)) !=null){
                int value = map.get(p.charAt(l));
                value++;
                map.put(p.charAt(l), value);
            }
            else {
                tempCount++;
                map.put(p.charAt(l), 1);
            }
        }

        int ans =0;
        while( j < n){
            if(map.get(s.charAt(j))!=null){
                int value = map.get(s.charAt(j));
                value--;
                if(value==0){
                    tempCount--;
                }

                map.put(s.charAt(j), value);
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(tempCount==0){
                    ans++;
                    res.add(i);
                }
                if(map.get(s.charAt(i))!=null){
                    int value = map.get(s.charAt(i));
                    value++;
                    if(value==1){
                        tempCount++;

                    }
                    map.put(s.charAt(i), value);
                }
                i++;
                j++;
            }
        }

        return res;
    }

}
