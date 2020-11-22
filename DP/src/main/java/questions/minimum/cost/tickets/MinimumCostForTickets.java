package questions.minimum.cost.tickets;

// problem link : https://leetcode.com/problems/minimum-cost-for-tickets/
public class MinimumCostForTickets {

    public int mincostTickets(int[] days, int[] costs) {
        boolean[] daysIncluded = new boolean[366];
        for(int day : days){
            daysIncluded[day] = true;
        }
        int[] cost = new int[366];
        cost[0]= 0;
        for(int i =1 ; i<366; i++){
            if (!daysIncluded[i]) {
                cost[i] = cost[i-1];
                continue;
            }
            int min ;
            min = cost[i-1] + costs[0];
            min = Math.min(min, cost[Math.max(0, i-7)]+ costs[1]);
            min =min = Math.min(min, cost[Math.max(0, i-30)]+ costs[2]);
            cost[i] = min;
        }
        return cost[365];
    }

}
