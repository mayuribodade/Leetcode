class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        List<Integer> list = new ArrayList<>();

        int[] count = new int[1001];

        for(int x : num1){
            count[x]++;
        }
        //find intersection in nums2
        for(int x : num2){
            if(count[x] >0){
                list.add(x);
                count[x]--;
            }
        }
        //convert list into array
        
        int[]ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}