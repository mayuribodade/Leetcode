class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;

        for(int i=0 ;i<k ; i++){
            leftsum = leftsum + cardPoints[i];
        }
        maxsum = leftsum;

        //now right backward traverse
        int rightidx = n-1;

        for(int i=k-1 ; i>=0 ; i--){
            leftsum = leftsum - cardPoints[i];//shrink window from left
            rightsum = rightsum + cardPoints[rightidx];//grow window from right
            rightidx--;
            maxsum = Math.max(maxsum , leftsum + rightsum);
        }
        return maxsum;
    }
}