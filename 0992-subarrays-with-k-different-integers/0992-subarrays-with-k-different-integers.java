class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int ans = maxsubarray(nums , k) - maxsubarray(nums , k-1);

        return ans;
    }
    private int maxsubarray(int []nums, int k){
        if(k<0) return 0;

        int left = 0;
        int count = 0;
        int right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(right<nums.length){
            int n = nums[right];
            map.put(n,map.getOrDefault(n,0)+1);

            while(map.size()>k){
                int leftelem = nums[left];
                map.put(leftelem , map.get(leftelem) - 1);
                if(map.get(leftelem) == 0) map.remove(leftelem);
                left++;
            }
            count = count + right-left+1;
            right++;
        }
        return count;
    }
}