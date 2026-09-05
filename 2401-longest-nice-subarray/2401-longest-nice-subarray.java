class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxlength = 0;
        int left = 0 ;
        int mask = 0; //to check all pairs have 0 bits
        //do not check adjacent elem check all elem , so we use mask

        for(int right = 0; right<nums.length ; right++){

           while((mask & nums[right])!= 0){
            //remove nums[left] from mask
            //slide window
              mask = mask ^ nums[left]; //sice mask contains nums[left] value only 
              //so on Xor of both it gives 0
                left++;
           }
           // Add current number to the window mask
           mask = mask | nums[right];
           maxlength = Math.max(maxlength , right-left+1);
        }
        return maxlength;
    }
}