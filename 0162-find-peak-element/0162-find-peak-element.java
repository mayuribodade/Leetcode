class Solution {
    public int findPeakElement(int[] nums) {

       int n = nums.length;

       if(n==1 ) return 0;// 0th index

       //If the peak happens to be at the very beginning or the very end of the array, it is caught right away before the binary search runs.

       if(nums[0] > nums[1]) return 0 ;// first index is peek

       if(nums[n-1] > nums[n-2]) return n-1; // last index is peek

       //if all this cases not run then apply binary search
        int s =1 , e = nums.length-2;

        while(s<=e){
            int mid = s + (e - s)/2;

            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if (nums[mid-1] < nums[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
}