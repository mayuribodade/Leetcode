class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0 , new ArrayList<>() , result);
        return result;
    }
    public void backtrack(int [] nums , int start , List<Integer> currentlist , List<List<Integer>> result){
        //add empty brackets
        result.add(new ArrayList<>(currentlist));

        for(int i=start ; i<nums.length ; i++){
            //add current elemt
            currentlist.add(nums[i]);
            //backtrack to add more elemt
            backtrack(nums , i+1 , currentlist , result);

            //not including that number
            currentlist.remove(currentlist.size() -1);// remove last elem
        }
    }
}