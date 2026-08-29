class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String concatenateString  = s+s;

        int n = concatenateString.length();

    //remove first and last charcter from concatenatestring
  
        String newstr =  concatenateString.substring(1,n-1);
        //1 is inclusive and n-1 is exclusive

        return newstr.contains(s);
    }
}