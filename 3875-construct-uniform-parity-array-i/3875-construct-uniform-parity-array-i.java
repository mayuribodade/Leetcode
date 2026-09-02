class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean evenflag = true;
        int idx = -1;

        for(int i=0 ; i<nums1.length ; i++){
            if((nums1[i] % 2) != 0){
                evenflag = false;
            }
        }
        boolean oddflag = true;
         for(int i=0 ; i<nums1.length ; i++){
            if(nums1[i] % 2  == 0){
                oddflag = false;
            }
        }

        if(evenflag) return true;
        else if(oddflag) return true;
        else{
            //both even and odd elements
            //we can make them atleast one odd or one even
            return true;
        }
    }
}