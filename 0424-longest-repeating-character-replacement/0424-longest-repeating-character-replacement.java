class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxfrq =  Integer.MIN_VALUE;
        int ans = 0;

        for(int right = 0; right<s.length() ; right++){
           int index = s.charAt(right) - 'A';
           freq[index]++;

           maxfrq = Math.max(maxfrq , freq[index]);

           int windowsize = right-left+1;
           int replacement = windowsize - maxfrq;

           // If more than k replacements are needed,
            // shrink the window

           while(replacement > k){
            //remove leeters from left 
            int leftindex = s.charAt(left) - 'A';
            freq[leftindex]--;
            left++;

            windowsize = right-left+1;
            replacement = windowsize - maxfrq;
           }

           //update ans = length of longest substring
           ans = Math.max(ans ,windowsize);
        }
        return ans;
    }
}