class Solution {
    public int distributeCandies(int[] candy) {
        HashSet<Integer> set = new HashSet<>();
        int n = candy.length;

        for(int i=0; i<candy.length; i++){
            set.add(candy[i]);
        }
        if(set.size()<=n/2) return set.size();
        return n/2;
    }
}