class Solution {
    int[][]dp ;
    private int solve(int left , int right){
        if(left>=right){
            return 0;
        }
        if(dp[left][right] != 0){
            return dp[left][right];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=left ; i<=right ; i++){
            int cost = i+ Math.max(solve(left,i-1) ,solve(i+1,right));

            ans = Math.min(ans , cost);
        }
        dp[left][right] = ans;
        return ans;
    }
    public int getMoneyAmount(int n) {
      dp = new int[n+1][n+1];
      return solve(1,n);
    }
}