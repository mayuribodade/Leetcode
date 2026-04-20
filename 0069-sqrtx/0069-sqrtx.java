class Solution {
    public int mySqrt(int x) {

        if(x < 2){
            return x;
        }
        int ans = 0;
        int low = 0;
        int high = x/2;
        while(low <= high){
            int mid = low + (high - low) /2;
            long expect = (long) mid * mid; // Use long to prevent overflow

            if(expect == x){
                return mid;
            }
            else if(expect > x){
                high = mid -1 ;
            }
            else{
                low = mid +1;
                ans = mid ;// Store mid because it's a potential floor answer
            }
        }
        return ans;
    }
}