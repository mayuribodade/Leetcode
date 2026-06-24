class Solution {
    public int getCommon(int[] num1, int[] num2) {
        HashSet<Integer> map = new HashSet<>();
        for(int x : num1){
            map.add(x);
        }
        for(int i=0; i<num2.length; i++){
            if(map.contains(num2[i])) return num2[i];
        }
        return -1;
    }
}