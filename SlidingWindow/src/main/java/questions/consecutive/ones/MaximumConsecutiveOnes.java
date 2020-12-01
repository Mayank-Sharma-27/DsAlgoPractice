package questions.consecutive.ones;

//problem link : https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaximumConsecutiveOnes {

    public int longestOnes(int[] A, int K) {
        int i = 0;
        int j =0;
        int count =0;
        int max =0;
        int temp =K;
        int n = A.length;
        while(j < n){
            if(A[j]==0 && temp >0){
                temp--;
                count++;
                j++;
            }
            else if(A[j]==1 && temp >=0){
                count++;
                j++;
            }
            else if(A[j]== 0 && temp ==0){
                if(A[i]==0){
                    temp++;

                }
                max= Math.max(count, max);
                count = count -1;
                i++;
            }

        }
        max= Math.max(count, max);
        return max;
    }

}
