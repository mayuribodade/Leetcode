class Solution {
    public int findJudge(int n, int[][] trust) {
        //maintain  2 arrays
        int[] outgoing = new int[n+1];// a person who trust
        int[] incoming = new int[n+1];// a person being trusted

        for(int i=0 ; i<trust.length ; i++){
            int a = trust[i][0] ;// a person who trust
            int b = trust[i][1];// a person being trusted

          // filling table
            outgoing[a]++;
            incoming[b]++;
        }
        // find judge and 1-based indexing
        for(int i=1 ; i<=n ; i++){
            if(incoming[i]== n-1 && outgoing[i] == 0 ){
                return i;
            }
        }
        return -1;
    }
}