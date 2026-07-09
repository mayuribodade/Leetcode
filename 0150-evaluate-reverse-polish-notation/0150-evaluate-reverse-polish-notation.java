class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String t : tokens){
            //pehle check akro ki token operator he ky
            if(t.equals("+") || t.equals("-") || t.equals("*") ||t.equals("/")) {

           //In Reverse Polish Notation, the first element you pop() is the right operand (b), and the second is the left operand (a).

                int b = s.pop(); // last elem (right)
                int a = s.pop(); // second last elm (left)

                if(t.equals("+")) s.push(a+b);
                else if(t.equals("-")) s.push(a-b);
               else if(t.equals("*")) s.push(a*b);
               else if(t.equals("/")) s.push(a/b);
            }
            else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }
}