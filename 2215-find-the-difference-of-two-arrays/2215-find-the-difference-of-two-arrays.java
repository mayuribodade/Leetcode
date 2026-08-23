class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int n : nums1){
            s1.add(n);
        }
        for(int n: nums2){
            s2.add(n);
        }

        List<Integer> list1 = new ArrayList<>();
        for(int n : s1){
            if(!s2.contains(n)) list1.add(n);
        }

        List<Integer> list2 = new ArrayList<>();
        for(int n : s2){
            if(!s1.contains(n)) list2.add(n);
        }

        result.add(list1);
        result.add(list2);

        return result;
    }
}