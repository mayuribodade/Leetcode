class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int[] ans = new int[spells.length];

        for(int i=0 ;i<spells.length; i++){
            //find target means succes/spell[i] = potion index
            long target  = (long)Math.ceil((double)success/spells[i]);

            int index = lowerbound(potions , target);

            ans[i] = potions.length - index;
        }
        return ans;
    }
    public static int lowerbound(int [] potion , long target){
        int low =0;
        int high = potion.length;
        while(low<high){
            int mid = low + (high - low)/2;

            if(potion[mid] < target){
                low = mid+1;
                //it should be on right half
            }
            else{
                //it should be on left side
                high = mid;
            }
        }
        return low; //returns index , value ggeater than equal to success
    }
}