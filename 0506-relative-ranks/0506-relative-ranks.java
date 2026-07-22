class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
       int maxscore = Integer.MIN_VALUE;
       
       for(int x : score){
         maxscore = Math.max(maxscore ,x);
       }

       int[] mp = new int[maxscore + 1];
       Arrays.fill(mp , -1);
       for(int i=0 ; i<n  ; i++){
        mp[score[i]] = i;
       }

       //iterate over original score arr
      int rank = 1;
      String [] ans = new String[n];

      for(int i=maxscore ; i>=0 ; i--){
    
    if (mp[i]!= -1){
        int idx = mp[i];
        if(rank == 1) ans[idx] = "Gold Medal";

       else if(rank == 2) ans[idx] = "Silver Medal";

       else if(rank == 3) ans[idx] = "Bronze Medal";

       else  ans[idx] = String.valueOf(rank);

       rank++;
    }     
  }
      return ans;
    }
}