class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxspeed = Integer.MIN_VALUE;

        //find maxspeed
        for(int n : piles){
            maxspeed = Math.max(maxspeed , n);
        }

        while(minspeed < maxspeed){
            int mid = minspeed + (maxspeed - minspeed)/2;

            if(canEat(piles , h , mid)) {
                //agar ghante jyada he original hours se to speed ko decrease karo
                maxspeed = mid;
            }
            else{
                minspeed = mid + 1;
            }
        }
        return minspeed;
    }
    public boolean canEat(int[] piles , int h , int speed){
        int hours = 0;
        for(int n : piles){
            hours += (int) Math.ceil((double)n/speed);
        }
        return hours <= h;
    }
}