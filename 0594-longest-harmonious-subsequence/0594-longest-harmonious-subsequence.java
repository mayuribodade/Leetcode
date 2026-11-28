class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n , map.getOrDefault(n,0) +1);
        }
        int x = map.size();
        int[] arr = new int[x];
        int k=0;

       for (int key : map.keySet()) {
         arr[k] = key;
         k++;
       }
       Arrays.sort(arr);
        int c = 0;
       for(int i=0; i<arr.length-1; i++){
        if(arr[i+1]-arr[i]==1) {
            c = Math.max(c , map.get(arr[i])+map.get(arr[i+1]));
        }
       }
       return c;
    }
}