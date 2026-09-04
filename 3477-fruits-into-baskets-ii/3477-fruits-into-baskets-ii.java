class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int count = 0;
        boolean [] usedbasket = new boolean[n];

        for(int i=0 ; i<n ; i++){
           for(int j=0 ; j<n ; j++){
                if(!usedbasket[j] && fruits[i] <= baskets[j]){
                    count++;
                    usedbasket[j] = true;
                    break;
                }
           }
        }
        int ans = n - count;
        return ans;
    }
}