class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int maxlength = 0;
        for(int n : nums){
            set.add(n);
        }
        for(int n : set){
           //start the begining if n-1 doesnt exist
           if(!set.contains(n-1)){
            int currnum = n;
            int streak = 1;

              while(set.contains(currnum +1)){
                currnum++;
                streak++;
              }
              maxlength = Math.max(streak , maxlength);
           }
           
        }
        return maxlength;
    }
}