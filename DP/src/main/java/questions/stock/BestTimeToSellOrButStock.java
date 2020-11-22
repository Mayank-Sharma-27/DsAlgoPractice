package questions.stock;

//problem link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToSellOrButStock {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] t =  new int[n+1];
        for(int i=0;i<n+1;i++){
            t[i] = 0;
        }
        for(int i =1;i<n+1;i++){
            for(int j =1; j<i ;j++){
                if(t[i-1]<prices[i-1]- prices[j-1]){
                    t[i] = Math.max(prices[i-1] - prices[j-1],t[i]);

                }
                else{
                    t[i] = Math.max(t[i-1],t[i]);
                }
            }
        }
        return t[n];
    }

}
