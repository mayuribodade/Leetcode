class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
       
       int left = 0;
       int right = 0;
       int maxlen=0;

       while(right<nums.length){
        //store freq and update it
        map.put(nums[right] , map.getOrDefault(nums[right],0) +1);

        //check if freq > k
        while(left<=right && map.get(nums[right]) >k){
            //decrease nums[left] freq and move left forward 
            //it means shrinking array from left
           map.put(nums[left] , map.get(nums[left]) - 1);
           left++;
        }
        //update length
        int subarrlen = right-left+1;
        maxlen = Math.max(maxlen , subarrlen);
        right++;
       }
        return maxlen;
    }
}