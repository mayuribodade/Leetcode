class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int x = k;
        while(x>=k){
            if(!set.contains(x)) return x;
            x += k;
        }
        return -1;
    }
}