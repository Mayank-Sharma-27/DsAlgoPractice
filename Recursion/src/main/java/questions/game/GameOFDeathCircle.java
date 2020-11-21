package questions.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// problem link : https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle/0
public class GameOFDeathCircle {

    public static void main (String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();

        while(t-->0){
            int n,k;

            n=sc.nextInt();
            k=sc.nextInt();

            List<Integer> a=new ArrayList<>();

            for(int i=1;i<=n;i++){
                a.add(i);
            }

            int ans=kill(a,0,k);

            System.out.println(ans);
        }
    }

    public static int kill(List<Integer> a,int i,int k){
        if(a.size()==1){
            return a.get(0);
        }
        int t=(i+k-1)%a.size();
        a.remove(t);

        return kill(a,t,k);
    }

}
