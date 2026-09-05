class Solution {
    public long countVowels(String word) {
        Long count  = (long)0;
        int n = word.length();

        for(int i=0 ; i<n ; i++){
            char ch = word.charAt(i);

         //if at that index we got vowel than from that index + 1 (including itself) and 
         //upto the n- ith index we got no. of substrings  that contain this vowel

           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
              count += (long)(i+1) * (n-i); // strting from left to ending to right
           }

        }
        return count;
    }
}