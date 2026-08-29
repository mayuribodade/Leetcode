class Solution {
    public int shipWithinDays(int[] weights, int days) {
       //find maxcap ans sumofall weights 
       //minimum capicity lies between both of them

       int mincap = 0;
       int maxcap = 0;

       //mincap must at least handle the heaviest package
       //maxcap = ship carries everything in one day

       for(int n : weights){
           mincap = Math.max(mincap , n);
           maxcap += n;
       }

       int low = mincap;
       int high = maxcap ;

       while(low < high){
        int mid = low + (high - low)/2;

          if(canShip(weights , days , mid)){
             // Capacity works.
                // Try smaller capacity.
                high = mid;
           }
           else{
             //if not work them increase capacity
               low = mid+1;
           }
       }
       return low;
    
    }
   private boolean canShip(int[] weights , int D , int load){
       int ddays = 1;
       int currentweight = 0;

       for(int n : weights){
          if(n + currentweight > load){
            //change day and update currentweight
            ddays++;
            currentweight = n;
          }
          else{
            currentweight += n;
          }
       }
       return ddays <= D;
   }
}