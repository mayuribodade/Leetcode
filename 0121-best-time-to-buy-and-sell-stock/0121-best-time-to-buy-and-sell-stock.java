class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

       for(int p : prices){
        if(buyprice < p){
            int profit = p - buyprice;
            maxprofit = Math.max(maxprofit , profit);
        }
        else{
           // buyprice > p
            buyprice = p;
        }
       }
        
        return maxprofit;
    }
}