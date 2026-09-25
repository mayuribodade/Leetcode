class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

       for(int n : nums1){
        set1.add(n);
       }
       for(int n : nums2){
        set2.add(n);
       }
       List<Integer> l1 = new ArrayList<>();
       for(int x : set1){
            if(!set2.contains(x)){
                 l1.add(x);
            }
       }

       List<Integer> l2 = new ArrayList<>();
       for(int x : set2){
            if(!set1.contains(x)){
                 l2.add(x);
            }
       }

       ans.add(l1);
       ans.add(l2);

       return ans;
        
    }
}