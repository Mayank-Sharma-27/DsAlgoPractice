package questions.parentheses;

import java.util.Stack;

// problem link : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class MinAddToMakeValid {

    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<Character>();
        if(S == null){
            return 0;
        }
        int n = S.length();
        if(n==1){
            return 1;
        }
        int number =0;
        for(int i =0 ; i< n ; i++){
            char  c = S.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            if(c==')'){
                if(stack.isEmpty()){
                    number++;
                }
                else{
                    stack.pop();
                }
            }
        }
        return number + stack.size();
    }

}
