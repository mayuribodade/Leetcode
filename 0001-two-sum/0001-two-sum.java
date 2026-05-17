class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

       for(int i=0 ; i<nums.length ; i++){
        int point = target - nums[i];
        if(map.containsKey(point)){
            return new int[]{map.get(point) , i};
        }
        map.put(nums[i] , i);
       }
       return new int[] {};
    }
}