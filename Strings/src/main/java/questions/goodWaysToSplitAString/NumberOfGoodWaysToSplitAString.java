package questions.goodWaysToSplitAString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NumberOfGoodWaysToSplitAString {

    public int numSplits(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n =  s.length();
        for(int i = 0  ; i < n ; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        HashSet<Character> set = new HashSet();

        for(int i =0 ; i< n ;i++){
            char ch =s.charAt(i);
            set.add(ch);
            map.put(ch, map.get(ch) - 1);
            if(map.get(ch) == 0) map.remove(ch);
            if(set.size() == map.size()) count++;
        }
        return count;
    }

}
