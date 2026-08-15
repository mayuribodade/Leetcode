class Solution {
    public int maxProduct(int[] nums) {
       int n = nums.length;
       //3 pointers
       long leftprod = 1;
       long rightprod = 1;
       long maxprod = nums[0];

       for(int  i=0 ;i<n ; i++){
        //if any pointer becomes 0 reset it to 1
        leftprod = (leftprod == 0 || leftprod < Integer.MIN_VALUE )? 1 : leftprod;
        rightprod = (rightprod == 0 || rightprod < Integer.MIN_VALUE )? 1 : rightprod;

        leftprod = leftprod * nums[i];
        rightprod = rightprod * nums[n-1-i];

        maxprod = Math.max(maxprod , Math.max(leftprod , rightprod));
       }
       return (int) maxprod;
    }
}