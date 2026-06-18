class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     //create hasmap
     HashMap<Integer , Integer> map = new HashMap<>();

     //store key value pair
     for(int num : nums){
        map.put(num , map.getOrDefault(num,0) +1);
     }
     //create Min Heap PQ 
     PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));

     for(int num : map.keySet()){ // it stores key actual elem
           pq.add(num); //adding element by following min heap approach
           if(pq.size()>k){
            pq.poll();
           }
     }
     //store elem
     int [] ans = new int[k];
     for(int i=k-1 ; i>=0 ; i--){
        ans[i] = pq.poll();
      }
      return ans;
    }
}