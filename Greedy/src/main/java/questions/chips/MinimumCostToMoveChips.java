package questions.chips;

// problem statement : https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MinimumCostToMoveChips {

    public int minCostToMoveChips(int[] position) {
        int two =0;
        int three=0;
        int one =0;
        for(int val : position){
            if(val==1){
                one++;
            }
            if(val==2 || val%2==0){
                two++;
            }
            if(val==3 || val%2!=0){
                if(val!=1){
                    three++;
                }
            }
        }

        if(one==0){
            if(three>two){
                return two;
            }
            else{
                return  three;
            }
        }
        if(one+three>= two){
            return two;
        }
        return one+three;

    }

}
