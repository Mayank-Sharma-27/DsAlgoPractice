package questions.parentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open =n;
        int close = n;
        String output = "";
        solve(open, close, ans,output);
        return ans;
    }

    void solve(int open , int close, List<String> ans, String output){
        if(open ==0 && close ==0){
            ans.add(output);
            return;
        }
        if(open!=0){
            String output1 = output;
            output1 = output1+"(";
            solve(open-1 , close, ans, output1);
        }
        if(close> open){
            String output2 = output;
            output2 = output2+")";
            solve(open, close-1, ans, output2);
        }
        return;
    }

}
