class Solution {
    public int trap(int[] height) {
        int n= height.length;

       // using TWO-POINTER
       int left =0 ;
       int right = n-1;
       int leftmax = 0;
       int rightmax =0 ;
       int trappedwater = 0;

      //left and right uses only for traversing on height array
       while(left <  right){
        //leftboundary updation and trappedwater calculation

        if(height[left] <= height[right]){
            //means leftside
            if(height[left] >= leftmax){
                //found maxboundary on left
                leftmax = height[left];
            }
            else{
                //leftma is grater
                trappedwater += leftmax - height[left];
            }
            left++;
        }

         else{  //rightboundary updation and trappedwater calculation
        // height[right] < height[left]

            if(height[right] >= rightmax){
             //found maxboundary on right
                 rightmax = height[right];
            }
             else{
                  trappedwater += rightmax - height[right];
            }
         right --;
        }
       }
       return trappedwater;

       //in this way we can update leftmax , rightmax and calculation of trappedwater in only one loop
    }
}