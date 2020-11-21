package questions.parentheses;

import java.util.Stack;

//  problem link : https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
public class ReverseSubstringsBetweenPairOfParentheses {

    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder result = new StringBuilder();
        int n =s.length();
        for(int i =0 ;i < n ; i++){

            if(s.charAt(i)==')'){
                StringBuilder sb = new StringBuilder();
                while(stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
                for(int j =0; j < sb.length() ;  j++){
                    stack.add(sb.charAt(j));
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();

    }

}
