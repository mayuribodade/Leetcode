class Solution {
    public int sumCounts(List<Integer> nums) {
        //first find all subarray
        int sumSquares = 0;
        int n = nums.size();

        for(int i=0 ; i<n ; i++){
            HashSet<Integer> set = new HashSet<>();

            for(int j=i ; j<n ; j++){
                set.add(nums.get(j));
                int elem = set.size();

                sumSquares += elem*elem;
            }
        }
        return sumSquares;
    }
}