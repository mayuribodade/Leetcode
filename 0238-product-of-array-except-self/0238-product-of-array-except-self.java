class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]arr = new int[nums.length];
        int n = nums.length;

        //let set first elem as 1
        arr[0] = 1;

        //first we will calculate prefix product 
        //arr[i] = arr[i-1]*nums[i-1]

        for(int i=1 ; i<n ; i++){
           arr[i] = arr[i-1]*nums[i-1];
        }

        //now suffix product from right side 
        int rightprod = 1;

        //we do arr[i] = arr[i]*rightprod; and then rightprod *= nums[i]

        for(int i=n-1 ; i>=0 ; i--){
            arr[i] = arr[i] * rightprod;
            rightprod = rightprod * nums[i];
        }
        return arr;
    }
}