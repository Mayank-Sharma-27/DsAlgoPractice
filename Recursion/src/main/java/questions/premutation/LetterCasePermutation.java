package questions.premutation;

import java.util.ArrayList;
import java.util.List;

// problem link : https://leetcode.com/problems/letter-case-permutation/
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        String output ="";
        solve(ans, S,output );
        return ans;
    }

    void solve(List<String> ans, String input, String output){
        if(input.length()==0){
            ans.add(output);
            return;
        }
        char ch = input.charAt(0);
        if(Character.isLetter(ch)){
            String output1 = output;
            output1 = output1+Character.toLowerCase(ch);
            String output2= output;
            output2 = output2+Character.toUpperCase(ch);;
            input = input.substring(1);
            solve(ans, input, output1);
            solve(ans, input, output2);
        }
        else{
            String output1 = output;
            output1 = output1+ch;
            input = input.substring(1);
            solve(ans, input, output1);
        }
        return;
    }

}
