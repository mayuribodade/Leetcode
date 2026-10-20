class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;//que want prime strictly less than n 
        }

        boolean isprime[] = new boolean[n+1];


        for(int i=2 ; i<=n ; i++){
            isprime[i] = true ; //intially
        }

        for(long i=2 ; i<=n ; i++){
            if(isprime[(int)i]){
                //mark all multiple of i false
                for(long j= i*i ; j<=n ; j= j+i){
                    isprime[(int)j]= false;
                }
            }
        }

        int count = 0;
        for(int i=2 ; i<n ; i++){
            if(isprime[i]) count++;
        }
        return count;
    }
}