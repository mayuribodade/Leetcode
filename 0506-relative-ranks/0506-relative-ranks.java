class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] temp = new Integer [n];

        for(int i=0 ; i<n ;i++){
            temp[i]= score[i];
        }
        //sort temp in DESC 
        Arrays.sort(temp , Collections.reverseOrder());

        HashMap<Integer, Integer> map = new HashMap<>();

       for(int i=0 ; i<n ; i++){
        map.put(temp[i] , i+1);//element and their rank
       }

       //iterate over original score arr
      String [] ans = new String[n];
      for(int i=0 ; i<n ; i++){
    
       int rank = map.get(score[i]);

        if(rank == 1) ans[i] = "Gold Medal";

       else if(rank == 2) ans[i] = "Silver Medal";

       else if(rank == 3) ans[i] = "Bronze Medal";

       else  ans[i] = String.valueOf(rank);
      }
      return ans;
    }
}