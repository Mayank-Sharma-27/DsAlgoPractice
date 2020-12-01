package questions.vowels;


import java.util.ArrayList;
import java.util.List;

//problem link : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
public class MaximumNumberOfVowels {

    public int maxVowels(String s, int k) {
        int n = s.length();
        List<Character> characterList = new ArrayList<>();
        characterList.add('a');
        characterList.add('e');
        characterList.add('i');
        characterList.add('o');
        characterList.add('u');
        int i =0;
        int j =0;
        int count =0;
        int maxCount =0;
        while(j<n){
            if(characterList.contains(s.charAt(j))){
                count++;
            }
            if(j-i+1<k){
                j++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                if(characterList.contains(s.charAt(i))){
                    count = count -1;
                }
                i++;
                j++;
            }
        }
        return maxCount;
    }

}
