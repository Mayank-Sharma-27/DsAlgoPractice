package questions.integerbreak;

// problem link :  https://leetcode.com/problems/integer-break/
public class IntegerBreak {

    public int integerBreak(int n) {
        if(n==2||n==3) return n-1;

        int t[]=new int[n+1];

        int max;

        t[0]=1;
        t[1]=1;
        for(int j=2;j<=n;j++) {
            max=Integer.MIN_VALUE;
            for(int i=1;i<=j;i++) {
                max=Math.max(max, i*t[j-i]);
            }
            t[j]=max;
        }

        return t[n];
    }

}
