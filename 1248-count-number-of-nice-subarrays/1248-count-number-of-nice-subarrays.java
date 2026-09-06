class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int ans = maxsubarray(nums , k) - maxsubarray(nums, k-1);

        return ans;
    }
    private int maxsubarray(int []nums , int k){
        if(k<0) return 0;

        int left =0 ;
        int right = 0;
        int count = 0;
        int i=0;

       //make array into binary array
        while(i < nums.length){
            if(nums[i] % 2 == 0) nums[i] = 0;
            else nums[i] = 1;
            i++ ;
        }
        int sum = 0;
        while(right < nums.length){
            sum = sum + nums[right];

            while(sum > k){
                sum = sum - nums[left];
                left++;
            }
            count = count + (right - left +1);
            right ++;
        }
       return count;
    }
}