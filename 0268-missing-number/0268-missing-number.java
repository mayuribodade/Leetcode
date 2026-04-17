class Solution {
    public int missingNumber(int[] nums) {
        /*
        //by XOR method
        int x1 = 0;
        int x2 =0 ;

        //first xor all N numbers then XOR array numbers

        for(int i=0 ; i<=nums.length ; i++){
            x1 = x1^i;
        }
         for(int i=0 ; i<nums.length ; i++){
            x2 = x2^nums[i];
        }
        return (x1^x2);
        */

        // by GAUSS method

        int n = nums.length;
        int expected = n*(n+1)/2;
        int actual = 0;
        for(int x : nums){
            actual += x;
        }
        return (expected - actual);
    }
}