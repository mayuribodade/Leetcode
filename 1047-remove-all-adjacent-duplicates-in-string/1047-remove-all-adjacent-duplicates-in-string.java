class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
         
            if(st.isEmpty() || st.peek() != ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            char a = st.pop();
            sb.append(a);
        }

        return sb.reverse().toString();
    }
}