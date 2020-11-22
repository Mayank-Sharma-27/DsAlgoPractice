package questions.averages;

// problem link : https://leetcode.com/problems/largest-sum-of-averages/
public class LargestSumOfAverages {

    public double largestSumOfAverages(int[] A, int K) {
        int n = A.length;
        double[][] t = new double[n][K+1];
        return  maxAvg(A, 0, t, K);

    }

    double maxAvg(int[] A, int i , double[][] t,  int k){
        if (k <= 0 || i >= A.length) return 0;
        if(t[i][k]!=0){
            return t[i][k];
        }
        if(k==1){
            return avg(i,A);
        }
        double sum=0;
        for(int j = i; j<= A.length -k; j++){
            sum=sum+ A[j];
            t[i][k] = Math.max(t[i][k], sum/(j-i+1) + maxAvg(A, j+1, t,k-1)) ;
        }
        return t[i][k];
    }

    static double avg(int start, int[] A) {
        return findAvg(start, A, A.length - 1);
    }

    static double findAvg(int start, int[] A, int end) {
        double sum = 0;
        for (int i = start; i <= end; i++) sum += A[i];
        return sum / (end - start + 1);
    }

}
