class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        //edge case
        if(n==2) return cost[0] + cost[1];
         
        Arrays.sort(cost);

        int sum = 0;
        for(int i= n-1 ; i>=0 ; i= i-3){
            if( i>=2 && cost[i-2] <= cost[i-1]){
              sum += cost[i] + cost[i-1];
             }
        // code for remaining candies ?

        //if 2 candies left
          else if(i==1){
             sum += cost[1]+cost[0];
           }
           // if one candy left
           else if(i==0){
            sum += cost[0];
           }
        }
        return sum;
    }
  
}