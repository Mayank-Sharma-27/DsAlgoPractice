package questions.string;

import java.util.Arrays;

// problem link : https://leetcode.com/problems/check-if-a-string-can-break-another-string/
public class CheckIfCanBreak {

    public boolean checkIfCanBreak(String s1, String s2) {
        s1 = sortString(s1);
        s2 = sortString(s2);
        return helper(s1,s2) || helper(s2,s1);
    }

    private boolean helper(String s1 , String s2){
        int n = s1.length();
        for(int i =0 ; i < n ; i++){
            if(s1.charAt(i)<s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private String sortString(String inputString)
    {

        char tempArray[] = inputString.toCharArray();


        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
