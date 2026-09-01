class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k +1];
        int idx = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        //first window of size k
        for(int i=0 ; i<k ; i++){
            while(dq.size()>0 && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);//index
        }

        for(int i=k ; i<nums.length ; i++){
            //add front of deque to ans 
            ans[idx++] = nums[dq.peekFirst()];

            //remove elem that are not part of current window
            while(dq.size()>0 && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            //remove smaller value from window
            while(dq.size()>0 && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);//index
        }
        //fill last elem of ans by adding front elem of dq
        ans[idx] = nums[dq.peekFirst()];

        return ans;
    }
}