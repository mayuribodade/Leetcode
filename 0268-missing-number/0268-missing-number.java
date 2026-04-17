class Solution {
    public int missingNumber(int[] nums) {
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
    }
}