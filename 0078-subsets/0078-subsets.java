class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();

       logic(nums , 0 , new ArrayList<>() , result);

       return result;
    }
    public void logic (int[] nums , int start , List<Integer> current , List<List<Integer>> result){
        //add result to 2d list
        result.add(new ArrayList<>(current));

        for(int i=start ; i<nums.length ; i++){
            //YES choice
            current.add(nums[i]);

            logic(nums, i+1 , current ,result );

            //remove elem NO choice
            current.remove(current.size()-1);
        }
    }
}