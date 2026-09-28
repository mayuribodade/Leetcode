class Solution {
    public int maxDepth(String s) {
        int maxdepth = 0;
        int ans = 0;

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                ans++;
                maxdepth = Math.max(maxdepth , ans);
            }
            if(s.charAt(i) == ')'){
                ans--;
               // maxdepth = Math.max(maxdepth , ans);
            }
        }
        return maxdepth;
    }
}