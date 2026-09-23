class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0 ;
        int j = 0 ;
        StringBuilder sb = new StringBuilder();
       
        while(i<word1.length() && j<word2.length()){
           char c1 = word1.charAt(i);
           char c2 = word2.charAt(j);

           sb.append(c1);
           sb.append(c2);

           i++;
           j++;
        }
        while(i < word1.length()){
            char c1 = word1.charAt(i);
            sb.append(c1);
            i++;
        }
        while(j < word2.length()){
            char c2 = word2.charAt(j);
            sb.append(c2);
            j++;
        }
        return sb.toString();
    }
}