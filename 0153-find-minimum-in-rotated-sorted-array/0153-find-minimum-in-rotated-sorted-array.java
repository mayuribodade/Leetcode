class Solution {
    public int findMin(int[] nums) {
        int low  = 0 ;
        int high = nums.length -1;

        while(low < high){
            int mid = low + (high - low)/2;

            // if mid element is grater than high elemt 
            //it means right half from mid+1 array is sorted

            if(nums[mid] > nums[high]){
                 low = mid+1; // move pointer
            }

            //else left half inculding mid element is sorted
            //if nums[mid] <= nums[high]
            else{
                 high = mid;
            }
        }
        //at last nums[low] is minimum element
        return nums[low];
    }
}