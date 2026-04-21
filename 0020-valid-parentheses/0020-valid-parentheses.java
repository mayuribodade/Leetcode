class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            //for opening bracket
            if(ch == '(' || ch =='{' ||ch =='['){
                stack.push(ch);
            }
            //else only closing bracket  for rest closing bracket
            else{
             // If stack is empty, no opening bracket to match → invalid
                if(stack.isEmpty()) return false;
               
               //remove top most character and check its matching
                char top = stack.pop();
                
                if(ch == ')' && top!= '(') return false;
                 if(ch == '}' && top!= '{') return false;
                 if(ch == ']' && top!= '[') return false;
                
            }
        }
        return stack.isEmpty();
    }
}