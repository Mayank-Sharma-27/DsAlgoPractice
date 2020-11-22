package questions.perfect.squares;


//  problem link : https://leetcode.com/problems/perfect-squares/
public class PerfectSquares {

    public int numSquares(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        int[] t = new int[n+1];

        t[0] = 0;
        t[1]=1;
        for(int i =2; i<  n+1; i++ ){
            t[i] = i;
            for(int j=1 ; j*j<=i; j++ ){
                t[i] = Math.min(t[i],1 + t[i]);

            }
        }
        return t[n];
    }

}
