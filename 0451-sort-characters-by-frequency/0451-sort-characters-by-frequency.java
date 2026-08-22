class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0 ;i<s.length() ;i++){
            char ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        //MAX heap
        PriorityQueue<Character> pq = new PriorityQueue<>
                          ((a,b)->map.get(b)-map.get(a));

        for(char ch : map.keySet()) {
           // add all unique character and in decreasing order of their frequency
           pq.add(ch);
        } 

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();

            int frq = map.get(ch);//frq of that character

            for(int i=0 ; i<frq ; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}