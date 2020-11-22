package questions.subsequence.arithmetic;


import java.util.Arrays;

// problem link : https://leetcode.com/problems/longest-arithmetic-subsequence/
public class LongestArithmeticSubsequence {

    public int longestArithSeqLength(int[] A) {
        int n = A.length;
        int[][] t= new int[n][1001];
        for(int i=0;i<A.length;i++) {
            Arrays.fill(t[i], 1);
        }
        int max = 0;
        for(int i =0; i<n;  i++){
            for( int j =0; j<i ; j++){
                int d = A[j] -  A[i] +500;
                t[i][d] = t[j][d]+1;
                max = Math.max(t[i][d],max);
            }
        }
        return max;
    }

}
