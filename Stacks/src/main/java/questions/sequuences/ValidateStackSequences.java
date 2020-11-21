package questions.sequuences;

import java.util.Stack;

// problem link : https://leetcode.com/problems/validate-stack-sequences/
public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int start=0;
        for(int i =0 ;  i< pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek()==popped[start]){
                stack.pop();
                start++;
            }
        }

        return stack.isEmpty();

    }

}
