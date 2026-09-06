class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       
       int ans = maxSubarray(nums, goal) - maxSubarray(nums , goal-1);

       return ans;
        
    }
    private int maxSubarray(int[] nums, int goal){
        if(goal < 0) return 0;

        int left = 0;
        int count = 0;
        int right = 0;
        int sum = 0;

        //we find for sum <= goal , then call function for goal and goal -1 we get ans

        while(right < nums.length){
           sum = sum + nums[right];

           while(sum > goal){
             sum = sum - nums[left];
             left++;
           }
           count = count + (right-left+1);
           right++;
        }
        return count;
    }

}