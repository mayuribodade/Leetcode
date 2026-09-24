class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]a = new int[nums.length];

      // Step 1: Left products store karna
       a[0] = 1;
       for(int i=1 ; i<nums.length ;i++){
         a[i] = a[i-1] * nums[i-1];
       }
       // Step 2: Right products se multiply karna
       int rightProd = 1;
       for(int i=nums.length-1 ; i>=0 ; i--){
          a[i] = a[i] * rightProd;
         rightProd = rightProd * nums[i];
       }
       return a;
    }
}