class Solution {
    public int change(int amount, int[] coins) {
        int [] dp = new int [amount+1];
        Arrays.fill(dp,0);
        
        dp[0] =1 ;// one way to make 0 , use no coin

        for(int c : coins){
            for(int j=c ; j<=amount ; j++){
                dp[j] = dp[j] + dp[j-c];
            }
        }
        return dp[amount];
    }
}