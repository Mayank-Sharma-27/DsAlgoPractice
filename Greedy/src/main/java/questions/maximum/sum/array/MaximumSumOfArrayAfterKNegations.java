package questions.maximum.sum.array;

import java.util.Arrays;

// problem link : https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
public class MaximumSumOfArrayAfterKNegations {

    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;
        for(int i=0; i<A.length; i++) {
            if(K > 0) {
                if(A[i] < 0) {
                    A[i] = Math.abs(A[i]);
                }
                else {
                    break;
                }
                K--;
            }

        }
        Arrays.sort(A);
        while(K > 0) {
            A[0] = -1 * A[0];
            K--;
        }
        for(int i : A) {
            sum += i;
        }
        return sum;
    }

}
