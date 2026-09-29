class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[] = new int[s.length()];

        int lastseen = -s.length();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
           if(ch == c){
            lastseen = i;
           }
           int dist = i-lastseen;
           ans[i] = dist;
        }

        lastseen = 2*s.length();
        for(int i=s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
           if(ch == c){
            lastseen = i;
           }
           int dist = lastseen - i;
           ans[i] = Math.min(ans[i],dist);
        }
        return ans;
    }
}