class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){

            if(!st.isEmpty()){
            int top = st.peek();

            if(ch == top){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        else st.push(ch);
            
        }

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}