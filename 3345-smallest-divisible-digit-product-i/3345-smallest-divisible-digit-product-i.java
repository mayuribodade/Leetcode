class Solution {
    public int smallestNumber(int n, int t) {
      
      for(int i=0 ; i<10 ; i++){
       int prod = 1;
       int x = n;
       while(x>0){
         int digit = x%10;
         prod = prod * digit;
         x = x/10;
       }
       if(prod % t == 0) return n ;
       else n++ ;
      }
      return -1;
    }
}