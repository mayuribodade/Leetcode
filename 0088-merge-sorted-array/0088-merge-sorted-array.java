class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       /* for(int i=0 ; i<n ; i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);*/
        //THREE POINTER METHOD

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){//ham nums2 ko 1 me dalre aUR SATH ME SORT BHI KRRE
               if(i>=0 && nums1[i] > nums2[j]){
                //back se elemnt store karege
                nums1[k] = nums1[i];
                k--;
                i--;
               }
               else{
                nums1[k] = nums2[j];
                k--;
                j--;
               }
        }
    }
}