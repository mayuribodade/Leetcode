class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     
     //this brute force gives TLE as it takes o(n^2) Complexity

       /* int n = temperatures.length;
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
               if(temperatures[j] > temperatures[i]){
                  a[i] = j-i;// indexes (days) store 
                  break;
               }
            }
        }
        return a;*/

        //By Monotanic Stack
        int n = temperatures.length;
        int[] a = new int[n];
        Stack<Integer> s = new Stack<>();
        //traverse from right to left
        // as we get future warmer temp from right only
        for(int i=n-1 ; i>=0 ; i--){
            while(!s.isEmpty() && temperatures[i] >= temperatures[s.peek()]){
                s.pop();//if warmer temp found then remove old temp and update new
            }
            if(s.isEmpty()){
                a[i] = 0; 
            }
            else{
                a[i]= s.peek()-i;//lastindex(day) - current index (day)
            }
            s.push(i);//push current index
        }
        return a;
    }
}