package questions.tempratures;

import java.util.Stack;

// problem link : https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int number =0;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i =n-1; i>=0  ; i--){
            if(stack.isEmpty()){
                ans[i] =0;
            }
            else if(!stack.isEmpty() && T[stack.peek()] > T[i]){
                ans[i] = stack.peek()-i;
            }
            else if(!stack.isEmpty() && T[stack.peek()] <= T[i]){
                while(!stack.isEmpty() && T[stack.peek()] <=T[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i] = 0;
                }
                else{

                    ans[i] = stack.peek()-i;
                }
            }
            stack.push(i);

        }

        return ans;
    }

}
