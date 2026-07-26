class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        //for  3 large no.s
        int ans1 = nums[n-1] * nums[n-2] * nums[n-3];
        //for 2 negative small no and 1 large no
        int ans2 = nums[0]*nums[1]*nums[n-1];
        return Math.max(ans1,ans2);
    }
}