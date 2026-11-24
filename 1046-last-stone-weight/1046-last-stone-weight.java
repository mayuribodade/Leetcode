class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

       for(int x : stones){
           pq.add(x);
       }
       while(pq.size() > 1){
         int a = pq.poll();
         int b = pq.poll();

         if(a>=b){
           pq.add(a-b);
         }
       }
       if(pq.size() == 1){
         return pq.poll();
       }
       else {
        return 0;
       }
    }
}