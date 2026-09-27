class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch != ')'){
                st.push(ch);
            }
           //now we get ) bracket
            else{
                StringBuilder sb = new StringBuilder();

                char top = st.pop();

                while(top != '('){
                    sb.append(top);
                    top = st.pop(); //jab top pe ) milega , loop terminated
                    // aur ) bhi hat jayega
                }
                
               for(int k=0 ; k<sb.length() ; k++){
                   st.push(sb.charAt(k));
               }
            }
        }

       StringBuilder ans = new StringBuilder();

       while(!st.isEmpty()){
          char c = st.pop();
          ans.append(c);
       }
       ans = ans.reverse();
       return ans.toString();
    }
}