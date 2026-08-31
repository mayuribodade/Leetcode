class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> s  = new Stack<>();

        //right smaller code
        for(int i=n-1 ; i>=0 ; i--){
            while(s.size()>0 && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
               
                right[i] = -1;
            }
            else{
                right[i] = s.peek();
            }
            s.push(i);
        }
        // Clear the stack before reusing it for the left smaller pass
        s.clear();

        //now left smaller
         for(int i=0 ; i<n ; i++){
            while(s.size()>0 && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //we fill -1 but instead it here in this problem we fill n
                left[i] = -1;
            }
            else{
                left[i] = s.peek();
            }
            s.push(i);
        }

        int ans = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            if(right[i] == -1 ){
                right[i] = n;
            }
            int width = right[i]-left[i]-1;
            int area = heights[i] * width;

            ans = Math.max(ans , area);
        }
        return ans;
    }
}