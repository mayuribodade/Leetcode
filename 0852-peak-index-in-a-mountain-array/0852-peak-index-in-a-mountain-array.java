class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //peek eelement is that element 
        //peek-1 < peek > peek +1 , peek dono se bada hona chahihe

        //sinec array is mountain array then idx 0 and n-1 can never be peek

        int start = 1 , end = arr.length-2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid-1] < arr [mid] && arr[mid] > arr[mid+1]){
                //peek found
                return mid;
            }
            else if(arr[mid-1] < arr[mid]){
                //means peek mid ke baad hoga right side me 
                //kyuki increasing order chalra he to baad me aayega peek

                start = mid+1;

            }
            else{
                //arr[mid] < arr[mid-1]
                //menas peek pehle hoga left me
                //kyuki decreasing order  chalra he to pehle aayega 

                end = mid-1;
            
            }
        }
        return -1;
    }
}