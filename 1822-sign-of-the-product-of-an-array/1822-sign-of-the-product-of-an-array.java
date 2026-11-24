class Solution {
    public int arraySign(int[] nums) {
        int countodd = 0;
    
        for(int x : nums){
            if(x == 0) return 0;

            else if(x < 0) countodd++;
        }
        if(countodd % 2 == 1){
            return -1;
        }
        else{
            return 1; // even numbers of countodd
        }
    }
}