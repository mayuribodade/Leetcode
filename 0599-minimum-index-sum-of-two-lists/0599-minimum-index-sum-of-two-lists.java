class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

       List<String> ans = new ArrayList<>();

        HashMap<String ,Integer> map = new HashMap<>();
        int minsum = Integer.MAX_VALUE;

        for(int i=0 ; i<list1.length ; i++){
            map.put(list1[i] , i);
        }
        for(int i=0 ; i<list2.length ; i++){
            if(map.containsKey(list2[i])){
                int sum = map.get(list2[i]) + i;

                if(sum < minsum){
                    minsum = sum;
                    ans.clear();
                    ans.add(list2[i]);
                }
                else if(sum == minsum){
                    ans.add(list2[i]);
                }
            }
        }
       return ans.toArray(new String[0]);
    }
}