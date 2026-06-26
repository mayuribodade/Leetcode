class Solution {
    public char findTheDifference(String s, String t) {
      char ans = 0;
       for(char ch : s.toCharArray()) {
        ans = (char)(ans^ch);
       }
       for(char ch : t.toCharArray()) {
        ans = (char)(ans^ch);
       }
       //ans contains extra eleme only
       return ans;
    }
}