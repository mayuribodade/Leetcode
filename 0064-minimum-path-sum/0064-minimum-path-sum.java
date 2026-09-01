class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];

        dp[0][0] = grid[0][0];

        //first row has no up so we fill it by suming its element
        for(int j=1 ; j<m ; j++){
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }

        //first col has not left so we fill it by summing its element
        for(int i=1 ; i<n ; i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }

        //core logic
        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<m ; j++){
                dp[i][j] = Math.min(dp[i][j-1] , dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[n-1][m-1];
    }
}