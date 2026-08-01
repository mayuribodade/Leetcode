class Solution {
    public String reverseWords(String s) {
      String [] word = s.split(" ");
      StringBuilder s1 = new StringBuilder();

      for(int i=0 ; i<word.length ; i++){

        StringBuilder sb = new StringBuilder(word[i]);
        String s2 = sb.reverse().toString();

        s1.append(s2);
        //after every reverse word give space till second last word
        
        if(i<word.length-1){
            s1.append(" ");
        }
      }
      return s1.toString();
    }
}