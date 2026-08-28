class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

       // T.C = O(logm + logn) = O(log(m*n)) optimized

       int m =matrix.length;
       int n = matrix[0].length;

       int startrow = 0 , endrow = m-1;

       //search that particular row in which target exist
       while(startrow <= endrow){
          int midrow = startrow + (endrow - startrow)/2;
          
          if(target >= matrix[midrow][0] && target <= matrix[midrow][n-1]){
            //found that row 
            //now apply binary serach on that row
            return searchInRow(matrix , target , midrow);
          }
          else if(target > matrix[midrow][n-1]){
            startrow = midrow+1;
          }
          else{
            endrow = midrow-1;
          }

       }
       return false;
    }

    private boolean searchInRow(int [][] matrix  , int target , int thatrow){
         int n = matrix[0].length;

        int  st=0 , end=n-1;

         while(st <= end){
            int mid = st + (end -st)/2;

            if(matrix[thatrow][mid] == target){
                //element found
                return true;
            }
            else if(target > matrix[thatrow][mid]){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
         }
         return false;
    }
}