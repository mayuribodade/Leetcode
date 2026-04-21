class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount+1;
        int[] dp = new int [amount+1];
        Arrays.fill(dp ,max);
        dp[0] = 0; // 0 coins to make amt 0 , -> use no coin
        for(int c : coins){
            for(int j=c ; j<=amount ; j++){
                dp[j] = Math.min(dp[j] , dp[j-c] +1);
            }
        }
       if(dp[amount] >amount){
        return -1;
       }
       else{
        return dp[amount];
       }
    }
}