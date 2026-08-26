class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String ans = "";

        for(int start = 0; start<n ; start++ ){
            for(int end =start ; end<n ; end++){
                int ones = 0;
                for(int i=start ; i<=end ; i++){
                    if(s.charAt(i) == '1' ) ones++;
                }
                if(ones == k){
                     String current = s.substring(start , end+1);

                     if(ans.equals("")) {
                        ans = current;
                     }
                    else if(current.length() < ans.length()){
                        ans = current;
                    }
                    else if(current.length() == ans.length() 
                    && current.compareTo(ans) <0){
                        //compare it lexicographically
                        //kya current , ans se lexicographically choti he ?
                         ans = current;
                    }
                }
            }
        }
        return ans;
    }
}