/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //brute force appraoch o(n)
      /*  for(int i=0 ; i<=n ; i++){
            if(isBadVersion(i)){
                return i;
            }
        }
        return -1;*/

        //we will try in o(log n) 
        //since pattern is G G G B B sorted then use binary search

        int left = 1;
        int right = n;
        while(left<right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid;//means mid is bad now check its previous also may be there
            }
            else{
                left = mid+1;//means till mid all are good
            }
        }
        return left;// first bad version
    }
}