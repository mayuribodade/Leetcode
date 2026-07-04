class Solution {
    public int countDistinctIntegers(int[] nums) {
        //set avoids duplicate value
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    private int reverse(int n){
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n = n/10;
        }
        return rev;
    }
}