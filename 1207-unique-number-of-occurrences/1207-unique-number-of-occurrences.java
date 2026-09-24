class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        boolean flag = true;
        HashSet<Integer> set = new HashSet<>();
        for(int x : map.values()){
            if(set.contains(x)) {
                flag = false;
                break;
            }
            set.add(x);
        }
        return flag;
    }
}