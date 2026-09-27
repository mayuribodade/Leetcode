class Solution {
    public int countElements(int[] nums) {
        boolean flag = true;
        for(int i=1 ; i<nums.length ; i++){
           if(nums[i-1] != nums[i]){
             flag = false;
             break;
           }
        }
        if(flag) return 0;
 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int n : nums){
            max = Math.max(max,n);
            min = Math.min(min,n);
        }

        int countmax = 0;
        int countmin = 0;

        for(int  n :nums){
            if(n == max) countmax++;
            if(n == min) countmin++;
        }

        return nums.length - countmin - countmax;

    }
}