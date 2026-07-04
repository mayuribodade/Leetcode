class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0 ; i<words.length-1 ; i++){
            String s1 = words[i];
            for(int j=i+1 ; j<words.length ; j++){
             String s2 = words[j];
           // instead of  String revs2 = new StringBuilder(s2).reverse().toString();

              if(s1.charAt(0) == s2.charAt(1) && s1.charAt(1) == s2.charAt(0)){
                count++;
              }
            }
        }
        return count;
    }
}