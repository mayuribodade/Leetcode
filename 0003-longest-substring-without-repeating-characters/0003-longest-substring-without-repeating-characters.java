class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxlength = 0;
        for(int right = 0 ; right<s.length() ; right++){
            char ch = s.charAt(right);
            
            while(set.contains(ch)){
               set.remove(s.charAt(left));
               left++;
            }

            //if not contains add it to the set
            set.add(ch);
            
            maxlength = Math.max(maxlength , right-left+1);
        }
        return maxlength;
    }
}