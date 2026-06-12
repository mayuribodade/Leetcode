class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            //even case
            return n;
        }
        else{
            //odd case
            return 2*n;
        }
    }
}