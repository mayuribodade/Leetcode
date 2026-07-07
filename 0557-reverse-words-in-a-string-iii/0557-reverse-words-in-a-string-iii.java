class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder s1 = new StringBuilder();

        for(int i=0 ; i<words.length ; i++){
            String s2 = new StringBuilder(words[i]).reverse().toString();

            s1.append(s2);
            if(i<words.length-1){ s1.append(" ");}

        }
        return s1.toString();
    }
}