class StockSpanner {

    Stack<int[]> s;

    public StockSpanner() {
       s = new Stack<>();
    }
    
    public int next(int price) {
       
     int countdays = 1 ;//including todays price also

     while(!s.isEmpty() && s.peek()[0] <= price){
        countdays += s.peek()[1];
        s.pop();
     }
     //update and push 
     s.push(new int[] {price , countdays});

     return countdays;
    
    }
       
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */