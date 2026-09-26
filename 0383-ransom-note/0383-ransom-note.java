class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();

        if(n>m) return false;

        int[] frq1 = new int[26];
        int[] frq2 = new int[26];

        for(int i=0 ; i<n ; i++){
            frq1[ransomNote.charAt(i) - 'a']++;
        }
        for(int i=0 ; i<m ; i++){
            frq2[magazine.charAt(i) - 'a']++;
        }
        for(int i=0 ; i<n ; i++){
           char ch1 = ransomNote.charAt(i);
           int idx = ch1 - 'a';

           if(frq1[idx] != 0  && frq2[idx] != 0) {
               frq1[idx]--;
               frq2[idx]--;
           }
           else if(frq1[idx] !=0 && frq2[idx] == 0) return false;
        }
        return true;
    }
}