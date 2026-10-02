class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : stones){
            pq.add(n);
        }

        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();

            int c = a-b;
            pq.add(c);
        }
        if(pq.size() == 1){
            return pq.poll();
        }
        else {
            return 0;
        }
    }
}