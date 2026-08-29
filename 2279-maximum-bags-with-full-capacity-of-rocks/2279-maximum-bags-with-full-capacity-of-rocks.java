class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            
        int bags = 0;

        int [] need = new int[capacity.length];

        for(int i=0 ;i<capacity.length ; i++){
            need[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(need);

        for(int needrock : need){
            if(needrock <= additionalRocks){
                additionalRocks -= needrock;
                bags++;
            }
            else{
                break;
            }
        }

        return bags;


        //brute force
       /* int bag = 0 ;
        for(int i=0 ; i<capacity.length ; i++){
            if(capacity[i] == rocks[i])continue;

            int needrocks = capacity[i] - rocks[i];

            rocks[i] = rocks[i] + needrocks;
            additionalRocks -= needrocks;

            if(additionalRocks == 0) break;
        }
        for(int i=0 ; i<capacity.length ; i++){
            if(capacity[i] == rocks[i]) bag++;
        }
        return bag;*/

       // You are filling bags in their original order.

       //but the goal is: Maximum number of full bags

        //So you should always fill the bags requiring the fewest additional rocks first.

        //for this we see in rocks how much it need to full capacity and then sort it
        //in this way first we fill min req rocks ans so on
        //and can get max no. of bags
    }
}