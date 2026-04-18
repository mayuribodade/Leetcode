class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //calculate total sum
        //maxsum at each value 
        //minimum sum at each value

        int maxsum =nums[0] ;
        int minsum =nums[0];
        int Totalsum = 0 ;
        int currMax = 0;
        int currmin = 0;


        for(int x : nums){
           Totalsum += x;

       // Standard Kadane's for Max Subarray
           currMax = Math.max(currMax , 0) + x ;
           maxsum = Math.max(currMax, maxsum);

           // Standard Kadane's for Min Subarray
           currmin = Math.min(currmin , 0) + x ;
           minsum = Math.min(currmin, minsum);
        }
        if(Totalsum == minsum){
            return maxsum;
        }
        return Math.max(maxsum , Totalsum - minsum);
    }
}