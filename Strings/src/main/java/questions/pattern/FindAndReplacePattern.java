package questions.pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// problem link : https://leetcode.com/problems/find-and-replace-pattern/
public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList();
        for(String s : words){
            Map<Character, Character> map = new HashMap();
            Map<Character, Character> map2 = new HashMap();
            int k =0;
            int length = s.length();
            for(int i =0; i< length; i++){
                char c = s.charAt(i);
                char c1 = pattern.charAt(i);
                if(map.get(c)==null){
                    map.put(c, c1);
                    if(map2.get(c1)!=null){
                        k=-1;
                        break;
                    }
                    else{
                        map2.put(c1,c);
                    }
                }
                else{
                    if(map.get(c)!=c1){
                        k=-1;
                        break;
                    }
                }
            }
            if(k==0){
                ans.add(s);
            }
        }


        return ans;
    }
    
}
