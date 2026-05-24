class Solution {
    public void duplicateZeros(int[] arr) {
       for(int i=0 ;i<arr.length-1 ; i++){
        if(arr[i] == 0){
            for(int j=arr.length-1 ; j>i ; j--){
                //right shift elments in array
                arr[j] = arr[j-1];
            }
            i++;//skip duplicate 0
        }
       }
    }
}