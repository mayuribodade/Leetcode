class Solution {
    public String countAndSay(int n) {
        // Base case for 1st term sequence
       String s  = "1";

       for(int i=2 ; i<=n ; i++){
          s = countAndAdd(s);
       }
       return s;
    }
    //helper function
    private String countAndAdd(String s){
        StringBuilder newstr = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i=1 ; i<s.length() ; i++){
            if(s.charAt(i) == c){
                count++; //same character
            }
            else{
                newstr.append(count);
                newstr.append(c);
                c = s.charAt(i); //new character
                count = 1; // reset
            }
        }
        //add last group also
         newstr.append(count);
         newstr.append(c);

         return newstr.toString();
    }
}