class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            nums[i] = square(nums[i]);
        }
        //sort the array  now
      Arrays.sort(nums);
      return nums;
    }
    private int square(int n){
        n = Math.abs(n);
        return n*n;
    }
}