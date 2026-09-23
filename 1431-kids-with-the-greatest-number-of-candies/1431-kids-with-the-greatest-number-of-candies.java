class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        int maxCandies = Integer.MIN_VALUE;

        for(int n : candies){
            maxCandies = Math.max(maxCandies , n);
        }
        for(int n : candies){
            if(n + extraCandies >= maxCandies) {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}