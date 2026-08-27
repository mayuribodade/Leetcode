class Solution {
    public int countKDifference(int[] nums, int k) {
       
       int count = 0;
       HashMap<Integer , Integer> map = new HashMap<>();

       for(int n : nums){

          int need1 = n -k;
          if(map.containsKey(need1)){
             count += map.get(need1);
          }
          int need2 = n+k;
          if(map.containsKey(need2)){
            count += map.get(need2);
          }
          map.put(n,map.getOrDefault(n,0)+1);

       }
       return count++;
      
    }
}