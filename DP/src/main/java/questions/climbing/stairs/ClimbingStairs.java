package questions.climbing.stairs;

// problem link : https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

    public int climbStairs(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] t = new int[n+1];
        t[0]=0;
        t[1]=1;
        t[2] =2;
        for(int i =3 ; i<n+1; i++){
            t[i] =  t[i-1]+ t[i-2];
        }
        return t[n];
    }

}
