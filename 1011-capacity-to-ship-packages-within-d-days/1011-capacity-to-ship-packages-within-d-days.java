class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap = 0;
        int maxcap = 0;

        for(int x : weights){
            // initially mincap = larget  elem of array
            mincap = Math.max(mincap ,x );
            // maxcap is total sum of array
            maxcap += x;
        }
        while(mincap < maxcap){
            int mid = mincap + (maxcap-mincap)/2;

            //taking capacity = mid
            int D = 1;
            int sum = 0 ;
            for(int weight : weights){
                if(sum + weight > mid){
                    D++;
                    sum = 0;
                }
                sum += weight;
            }
            //if more days required then increase capicity
            if(D > days ){
                mincap = mid+1;
            }
            else{// if days are less or equal 
                maxcap = mid;
            }
        }
        return mincap;
    }
}