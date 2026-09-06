class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int ans = maxsubarray(nums , k) - maxsubarray(nums , k-1);

        return ans;
    }
    private int maxsubarray(int []nums, int k){
        if(k<0) return 0;

        int left = 0;
        int count = 0;
        int right = 0;
        int distinct =0;
       
       int[] freq = new int [nums.length+1];

        while(right<nums.length){
            int n = nums[right];
           if(freq[n] == 0) distinct++;

           freq[n]++;

            while(distinct >k){
                int l = nums[left];
                freq[l]--;
                if(freq[l] == 0) distinct--;
                left++;
            }
            count = count + right-left+1;
            right++;
        }
        return count;
    }
}