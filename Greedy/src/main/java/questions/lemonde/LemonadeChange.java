package questions.lemonde;

// problem link : https://leetcode.com/problems/lemonade-change/
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;

        if(bills.length==1){
            return false;
        }

        for(int i =0; i < bills.length ; i++){
            if(bills[i]==5){
                five++;
            }
            if(bills[i]==10){
                if(five==0){
                    return false;
                }
                ten++;
                five--;
            }
            if(bills[i]==20){
                if(ten==0 ){
                    if(five<3){
                        return false;
                    }
                    else{
                        five= five-3;
                    }
                }
                else{


                    if(five==0){
                        return false;
                    }
                    five--;
                    ten--;
                }

            }
        }
        return true;

    }
}
