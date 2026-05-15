class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create map 
        HashMap<Integer ,Integer > map = new HashMap<>();
        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0) +1);
        }

        //creste min heap priority queue
        PriorityQueue <Integer > pq = new PriorityQueue<>((a,b)->map.get(a) -map.get(b));
        //add elements uniquely
        for(int num : map.keySet()){ //add only key elemnt o=not freqq
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        //store elemt
        int [] ans = new int[k];
        for(int i=k-1 ; i>=0 ; i--){
            ans[i]= pq.poll();
        }
        return ans;
    }
}