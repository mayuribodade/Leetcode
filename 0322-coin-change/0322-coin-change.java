class Solution {
    public int coinChange(int[] coins, int amount) {

        //minimum coins to make amount

        //initial max value = for this max valye will not be grater than amount 
       int max = amount+1;
       int [] dp = new int [max];

       //fill array by max value initially
       Arrays.fill(dp , max);

       dp[0] = 0 ;// 0 ways to make amt 0

       for(int c : coins){
        for(int j = c ; j<=amount ; j++){
            dp[j] = Math.min(dp[j] , dp[j-c]+1);
          }
       }
       if(dp[amount]>amount){
        return -1;
       }
       else{
        return dp[amount];
       }
    }
}