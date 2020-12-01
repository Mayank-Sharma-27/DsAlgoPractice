package questions.maximum.sum.subarray;

import java.util.ArrayList;

//problem link : https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaximumSumSubarray {

    static int maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        int sum = 0;
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while(j < N){
            sum = sum + Arr.get(j);
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1 == K){
                max = Math.max(max, sum);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }

}
