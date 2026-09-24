class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
       for(int i=0 ; i<k ; i++){
        sum = sum + nums[i];
       }
       int maxsum = sum;

       for(int i=k ; i<nums.length ; i++){
        //slide window form left i-k ; 4-4 = 0 means remove 0th elem
        sum = (sum - nums[i-k]) + nums[i];
         maxsum = Math.max(sum , maxsum);
       }
       return (double) maxsum/k;
    }
}