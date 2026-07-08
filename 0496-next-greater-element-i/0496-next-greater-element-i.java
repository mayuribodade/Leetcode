class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();

       //since nums2 contains all element of nums1 also
        for(int i=0 ; i<nums2.length ; i++){
          int greater = -1;
          for(int j=i+1 ; j<nums2.length ; j++){
            if(nums2[j]>nums2[i]){
                greater = nums2[j];
                break;
            }
          }
          map.put(nums2[i] , greater);
        }

        //now store in array
        int[] a = new int[nums1.length];
        for(int i=0 ; i<a.length ; i++){
            a[i] = map.get(nums1[i]);// it will give present elements greater elem from map
        }
        return a;
    }
}