package questions.water.bottles;

// problem statement : https://leetcode.com/problems/water-bottles/
public class WaterBottles {

    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int numberOfFullBottles = numBottles;
        int numberOfEmptyBottles = 0;
        if(numBottles <  numExchange){
            return count;
        }
        while(true){
            numberOfEmptyBottles = numberOfFullBottles + numberOfEmptyBottles%numExchange;
            numberOfFullBottles = numberOfEmptyBottles/numExchange;
            if(numberOfFullBottles==0){
                break;
            }
            count = count + numberOfFullBottles;

        }
        return count;
    }

}
