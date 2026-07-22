class Solution {
    public int balancedStringSplit(String s) {
        int j = 0;
        int count = 0;
        for(int i=0 ; i<s.length(); i++){
            char ch  = s.charAt(i);
           if(ch == 'R' ) j++;
           else j--;
           if(j==0) count++;
        }
        return count;
    }
}