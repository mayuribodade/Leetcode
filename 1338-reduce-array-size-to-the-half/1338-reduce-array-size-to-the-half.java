class Solution {
    public int minSetSize(int[] arr) {
        HashMap< Integer , Integer> map = new HashMap<>();

        for(int nums : arr){
            map.put(nums , map.getOrDefault(nums ,0) +1);
        } 

        //creat max heap PQ 
        PriorityQueue<Integer>pq =new PriorityQueue<>(Collections.reverseOrder());

        //insert freq in pq
        pq.addAll(map.values());//high frq top of queue

        int setSize = 0;
        int removed = 0;
        int target = arr.length/2;
        while(removed < target){
            removed += pq.poll();

            setSize++;
        }
        return setSize;
    }
}