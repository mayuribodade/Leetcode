class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2 ;
        int expectedsum = 0;

        for(int x : nums){
            expectedsum += x;
        }
        return sum - expectedsum;
    }
}