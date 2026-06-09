class Solution {
    public int[] sortedSquares(int[] nums) {
        //we use two pointer approach to reduce o(n log n) sorting complexity
        int n = nums.length;
        int[] res = new int[n];
        //pointers
        int left = 0;// start index
        int right = n-1 ;// last index
        int idx = n-1 ;// to track and fill result array

        while(left<= right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            // now sorting also perform along filling the result array

            if(leftsq > rightsq){
                res[idx] = leftsq;
                left++;
            }
            else{
                res[idx] = rightsq;
                right--;
            }
            idx--; // result array pointer updation
        }
        return res;
    }
}