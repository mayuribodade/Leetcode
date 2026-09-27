class Solution {
    public String reverseParentheses(String s) {
         
         StringBuilder sb = new StringBuilder ();

         for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == ')'){
                int idx = sb.length()-1; 

                while(idx >=0 && sb.charAt(idx) != '('){
                    idx--; //check ( left side
                }
                //we find first ( now after that reverse string
                StringBuilder newstr = new StringBuilder(sb.substring(idx+1));

                newstr.reverse();

            // Replace the old part (including '(') with the reversed string
                sb.delete(idx , sb.length());
                sb.append(newstr);
            }

            else{
                //add until we find )
                sb.append(ch);

            }
         }
         return sb.toString();
    }
}