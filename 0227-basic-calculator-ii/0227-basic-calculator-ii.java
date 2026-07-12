class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
       
        char lastopr = '+';

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            //10 build the num
            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0'); // it handles when value is like 123
            }

           //2. Process when we hit an operator or the last character
        // We ignore spaces here by checking (ch != ' ')
         
           if((!Character.isDigit(ch) && ch != ' ' ) || i==s.length()-1){

             if( lastopr =='+') st.push(num);
           else if(lastopr == '-') st.push(-num);
            else if(lastopr == '*'){
                int top = st.pop();
                st.push(top * num);
              }
              else if (lastopr == '/'){
                int top = st.pop();
                st.push (top/num);
              }
              lastopr = ch;
              num = 0;// reset num to 0
           }

        }
        int sum = 0;
       while(!st.isEmpty()){
        sum += st.pop();
       }
        return sum;
    }
}