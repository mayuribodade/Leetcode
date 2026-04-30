class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int n = nums.length;
        //duplicate
        for(int i=0 ; i<n ; i++){
            int idx = Math.abs(nums[i]) - 1; //value of current pos % 0 based indxing with non negative value

            // if value (nums[idx]) is already negative then nums[i] is our duplicate value
            if(nums[idx] < 0){
                dup = Math.abs(nums[i]);
            }
            //if nums is positive , make it negative because it is  non - duplicate value
            else{
                nums[idx] *= -1;
            }
        }
        //missing elementif val is positive it means i+1 is missing ele
        for(int i=0 ;i<n ;i++){
            if(nums[i]>0){
                return new int []{dup , i+1};
            }
        }
        return new int[] {-1,-1};
    }
}