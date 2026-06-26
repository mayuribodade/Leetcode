class Solution {
    public char findTheDifference(String s, String t) {
       Stack<Character> stack = new Stack<>();
       for(int i=0 ; i<s.length() ;i++){
            stack.push(s.charAt(i));
       }
       for(int i=0 ; i<t.length() ; i++){
        char ch = t.charAt(i);
          if(stack.contains(ch)){
            //// Removes the specific character found in stack
            stack.remove(stack.lastIndexOf(ch));
          }
          else{
            //stack doesn't contains that element means it is extra one
            return ch;
          }
       }
       return ' ';
    }
}