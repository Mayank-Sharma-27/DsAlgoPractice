package questions.partition;

// problem link : https://leetcode.com/problems/partition-array-for-maximum-sum/
public class PartitionArrayForMaximumSum {

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        if(n==0){
            return 0;
        }
        int[] t = new int [n+1];
        int max=-1;
        t[0] =0;
        for(int i =1; i<n+1; i++ ){
            max = arr[i-1];
            for(int j =i; j>i-k && j > 0; j--){
                max = Math.max(max, arr[j-1]);
                t[i] = Math.max((i-j+1)*max + t[j-1], t[i]);
            }
        }
        return t[n];
    }

}
