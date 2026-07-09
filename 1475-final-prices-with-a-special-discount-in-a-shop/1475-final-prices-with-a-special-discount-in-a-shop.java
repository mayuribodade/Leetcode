class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int [] a = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            while(!s.isEmpty() && prices[i] < s.peek()){
                s.pop(); //remove and update
            }
            //updation 
            if(s.isEmpty()){
                a[i] = prices[i];
            }
            else { 
                a[i] = prices[i]- s.peek();
            }

            s.push(prices[i]);
        }
        return a;
    }
}