class Solution {
    public int[] sortArray(int[] nums) {
      mergesort(nums , 0 , nums.length-1);
      return nums;
    }

    private void mergesort (int [] nums, int start , int end){

        if(start >= end) return ;
        int mid = start + (end - start)/2;

        mergesort(nums , start , mid);
        mergesort(nums, mid+1, end);
        merge(nums , start , mid , end);
    }
    private void merge (int [] nums , int left , int mid , int right){
        int [] temp = new int[right-left+1];
        int i = left ;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<= right){
            if(nums[i] <= nums[j]){
               temp[k] = nums[i];
               i++;
               k++;
            }
            else{
                temp[k] = nums[j];
                k++;
                j++;
            }
        }
        while(i<= mid){
            temp[k] = nums[i];
            i++;
            k++;
        }
        while(j<= right){
            temp[k] = nums[j];
            j++;
            k++;
        }
      //copy the element of temp in nums
      for(int t=0 ; t<temp.length ; t++){
        nums[left + t] = temp[t];
      }
    }
}