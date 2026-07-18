class Solution {
    public int minimumDeletions(int[] nums) {
         int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxpos = -1;
        int minpos = -1;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxpos = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minpos = i ;
            }
        }
        // we have max pos and minpos
        int n = nums.length;
        // delete both elem from

      int i = Math.min(minpos, maxpos); // The index of the element closer to the front
    int j = Math.max(minpos, maxpos); // The index of the element closer to the back

        int front = j +1;
        int back = n - i;
        int bothside = (i + 1) + (n-j);

        return Math.min(front , Math.min(back , bothside));
    }
}