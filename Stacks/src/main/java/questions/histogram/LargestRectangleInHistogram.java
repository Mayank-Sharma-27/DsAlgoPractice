package questions.histogram;

import java.util.Stack;

// problem link : https://leetcode.com/problems/largest-rectangle-in-histogram/
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length ==0){
            return 0;
        }

        int n = heights.length;

        int[] right = new int[n];
        int[] left = new int[n];
        int[] width = new int[n];
        int[] area = new int[n];
        fillLeft(left,heights);
        fillRight(right, heights);

        for(int i = 0 ; i< n ; i++){
            width[i] = right[i] - left[i] -1;
        }
        for(int i =0 ; i< n; i++){
            area[i] = width[i] * heights[i];
        }

        return getMax(area);
    }

    void fillLeft(int[] left, int[] heights){
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        for(int i =0 ; i< n ;  i++){
            if(stack.isEmpty()){
                left[i] = -1;
            }
            else if(!stack.isEmpty() && heights[stack.peek()] < heights[i]){
                left[i] = stack.peek();
            }
            else if(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                while(!stack.isEmpty() && heights[stack.peek()]>= heights[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    left[i] = -1;
                }
                else{
                    left[i] = stack.peek();
                }
            }
            stack.push(i);
        }
    }

    void fillRight(int[] right, int[] heights){
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        for(int i =n-1 ; i>= 0 ;  i--){
            if(stack.isEmpty()){
                right[i] = n;
            }
            else if(!stack.isEmpty() && heights[stack.peek()] < heights[i]){
                right[i] = stack.peek();
            }
            else if(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    right[i] = n;
                }
                else{
                    right[i] = stack.peek();
                }
            }
            stack.push(i);
        }
        reverse(right, right.length);
    }

    void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

    }

    public  int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

}
