class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map1 = new HashMap<>();
         HashMap<Integer , Integer> map2 = new HashMap<>();

         for(int x : num1){
            map1.put(x , map1.getOrDefault(x , 0)+1);
         }
         for(int x : num2){
            map2.put(x , map2.getOrDefault(x , 0)+1);
         }
        for(int i=0; i<num1.length; i++){
           if(map1.containsKey(num1[i]) && map2.containsKey(num1[i])){
             if(map1.get(num1[i])>0 && map2.get(num1[i])>0){
                list.add(num1[i]);
                map1.put(num1[i] , map1.getOrDefault(num1[i] , 0)-1);
                 map2.put(num1[i] , map2.getOrDefault(num1[i] , 0)-1);
            }
           }
        }
        int[]ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}