class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int n= nums.length;
        //first loop fill the map
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
   //second loop check freq more that n/3

            //iterarate and check
            for(Integer k : map.keySet()){
                if(map.get(k) > n/3){
                    result.add(k);
                }
            }
        
        return result;
    }
}