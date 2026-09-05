class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[nums.length-k +1];
        int idx = 0;

        Deque<Integer> dq = new ArrayDeque<>();

      for(int i=0 ; i<n ; i++){
        //remove element indixes from current window first ,means remove expires window
        while(!dq.isEmpty() && dq.peekFirst() <= i-k){
            dq.pollFirst();
        }
        //add ggreater elemet and remove smaller from dq
        while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
            dq.pollLast();
        }

        //add greater elem
         dq.addLast(i);//add index

         if(i >= k-1){
            ans[idx++] = nums[dq.peekFirst()];
         }
      }
      return ans;
    }
}