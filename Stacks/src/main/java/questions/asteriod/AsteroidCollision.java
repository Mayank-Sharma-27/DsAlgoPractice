package questions.asteriod;

import java.util.Stack;

//  problem link : https://leetcode.com/problems/asteroid-collision/
public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack();
        stack.push(asteroids[0]);

        for(int i =1 ; i<n ; i++ ){
            int element =  asteroids[i];
            boolean destroyed = false;
            if(!stack.isEmpty() && willCollide(stack.peek(), asteroids[i])){
                while(!stack.isEmpty()){
                    if(!willCollide(stack.peek(),element)){
                        stack.push(element);
                        break;
                    }
                    if( Math.abs(element)==Math.abs(stack.peek()) && willCollide(stack.peek(),element)){
                        stack.pop();
                        destroyed= true;
                        break;


                    }
                    if( Math.abs(element)> Math.abs(stack.peek())){
                        stack.pop();
                    }

                    else{
                        break;
                    }
                }
                if(stack.isEmpty() && !destroyed){
                    stack.push(element);

                }


            }
            else {
                stack.push(element);
            }
        }
        int i =stack.size()-1;
        int[] arr = new int[stack.size()];
        while(!stack.isEmpty()){
            arr[i] = stack.pop();
            i--;
        }
        return arr;
    }

    boolean willCollide(int e1, int e2){
        if(e1 >0&& e2<0){
            return true;
        }
        if(e1 < 0 && e2> 0){
            return false;
        }
        return false;

    }

}
