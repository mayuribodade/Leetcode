class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0;
        int k = nums.length;

        for(int i=0 ; i<k ; i++){
           if(nums[i] == 0){
            //check  its left neighbour
            boolean left = false;
            if(i==0 || nums[i-1] == 0) left =true;

            boolean right = false;
            if(i==k-1 || nums[i+1] == 0) right = true;

            if(left && right){
                nums[i] = 1;
               n--;
            }
           }
        }
        if(count >= n){
            return true;
        }
        else{
            return false;
        }
    }
}