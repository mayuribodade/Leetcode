class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the next greater element for each value in nums2
        int[] nextGreater = new int[10001];
        
        // Fill the map
        for (int i = 0; i < nums2.length; i++) {
            int found = -1;
            // Look only at elements to the right
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    found = nums2[j];
                    break; // Found the first greater, stop searching
                }
            }
            nextGreater[nums2[i]] = found;
        }
        
        // Build the result for nums1 using the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater[nums1[i]];
        }
        
        return result;
    }
}