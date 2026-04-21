class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[1]-b[1]);//sort on the basis of end time

        int count=1; // 1st activity always runs

        int lastend = intervals[0][1];//first activity end time

        for(int i= 1 ; i<intervals.length ; i++){
            if(intervals[i][0] >= lastend){
                count++;
                lastend = intervals[i][1];
            }
        }
        return intervals.length - count ;// non overlapping intervals
    }
}