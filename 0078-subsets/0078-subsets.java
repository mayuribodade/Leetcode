class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
    
      logic(nums ,0 , new ArrayList<>(), result);

      return result;

    }
    public void logic(int[] nums ,int start , List<Integer> current , List<List<Integer>> result){
        //make 2d list to store ans
        result.add(new ArrayList<>(current));
        
        for(int i= start ; i<nums.length ; i++){
            //add current including elem
            current.add(nums[i]);

            logic(nums, i+1 , current , result);

            //not including elem
            current.remove(current.size()-1);
        }
    }
    
}