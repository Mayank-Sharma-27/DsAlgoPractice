package questions.parentheses;

import java.util.Stack;

// problem link : https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
public class MinimumInsertionsToBalanceAParenthesesString {

    public int minInsertions(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int index =0;
        int ans=0;
        while(index<n){
            char c=  s.charAt(index);
            if(c=='('){
                stack.push(s.charAt(index));
            }
            if(index==n-1){
                if(c == ')'){
                    if(stack.isEmpty()){
                        ans = ans+2;
                    }
                    else{
                        stack.pop();
                        ans = ans+1;
                    }
                    break;
                }
            }
            if(c==')' && s.charAt(index+1)!= ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                    ans++;
                }
                else{
                    ans= ans+2;
                }
            }
            if(c == ')' && s.charAt(index+1) == ')'){
                if(stack.isEmpty()){
                    ans++;
                }
                else{
                    stack.pop();

                }
                index= index+2;
            }
            else{

                index++;
            }
        }
        if(!stack.isEmpty()){
            ans = ans+ 2*stack.size();
        }
        return ans;
    }

}
