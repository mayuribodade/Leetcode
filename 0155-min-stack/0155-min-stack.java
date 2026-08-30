class MinStack {
    // Stack to store arrays of size 2: [current_value, current_minimum]
   private Stack<long[]>st; 

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
       if(st.isEmpty()){
         st.push(new long[]{value ,value});
       } 
       else{
        long currentMin = Math.min(value , st.peek()[1]);//because minvalue present in 2nd place of stack pair
        st.push(new long[]{value , currentMin});
       }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return (int) st.peek()[0];//first value of top stack plate
    }
    
    public int getMin() {
       return (int) st.peek()[1];//second value of top stack plate i.e. minvalue
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */