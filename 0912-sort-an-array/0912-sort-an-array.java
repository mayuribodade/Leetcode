class Solution {
    public int[] sortArray(int[] nums) {
      int[] temp = new int[nums.length];
      mergesort(nums ,temp , 0 , nums.length-1);
      return nums;
    }

    private void mergesort (int [] nums, int[] temp , int start , int end){

        if(start >= end) return ;
        int mid = start + (end - start)/2;

        mergesort(nums , temp, start , mid);
        mergesort(nums, temp, mid+1, end);
        merge(nums , temp ,start , mid , end);
    }
    private void merge (int [] nums ,  int[] temp , int left , int mid , int right){
        int i = left ;
        int j = mid+1;
        int k = left; //strting point;

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
      for(int t=left ; t<= right ; t++){
        nums[t] = temp[t];
      }
    }
}