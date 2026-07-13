class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        return time(endTime) - time(startTime) ;
        
    }
    private int time(String s){
        String [] t = s.split(":");
        int h = Integer.parseInt(t[0]);
        int m =  Integer.parseInt(t[1]);
        int sec =  Integer.parseInt(t[2]);

      //converting all into seconds
        int time = (h*3600) + (m*60) + sec;

        return time;
    }
}