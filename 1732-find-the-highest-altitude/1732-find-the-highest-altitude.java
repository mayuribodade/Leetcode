class Solution {
    public int largestAltitude(int[] gain) {
        int n  = gain.length;
        int ans[] = new int[n+1];

        ans[0] = 0;
        ans[1] = gain[0];

        for(int i=2 ; i<ans.length ; i++){
            ans[i] = ans[i-1] + gain[i-1];
        }
        int max = Integer.MIN_VALUE;
        
        for(int x : ans){
            max = Math.max(x,max);
        }
        return max;
    }
}