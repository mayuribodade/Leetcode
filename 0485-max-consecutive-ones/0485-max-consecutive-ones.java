class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount = 0;

        for(int n : nums){
            if(n == 0){
                count = 0;
            }
            else{
                count++;
            }
          maxcount = Math.max(count , maxcount);
        }
        return maxcount;
    }
}