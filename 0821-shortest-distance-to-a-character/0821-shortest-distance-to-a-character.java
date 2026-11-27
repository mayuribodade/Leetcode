class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> idx = new ArrayList<>();
        int n = s.length();
        int[] ans = new int[n];

        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == c){
               idx.add(i);
            }
        }

        for(int i=0 ; i<n ; i++){
            int mindist = 10000;

            for(int j : idx){
              mindist = Math.min(mindist , Math.abs(j-i));
            }
            ans[i] = mindist;
        }
        return ans;
    }
}