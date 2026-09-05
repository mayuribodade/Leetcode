class Solution {
    public int numberOfSubstrings(String s) {
        int[]lastfreq = {-1,-1,-1};
        int count = 0;

        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);

            lastfreq[ch-'a'] = i;//store index on which this char found last

            if(lastfreq[0] !=-1 && lastfreq[1] != -1 && lastfreq[2]!= -1){
                //all abc present
                int value = Math.min(lastfreq[0] ,Math.min(lastfreq[1],lastfreq[2]));
                count = count + (1+value);// 0  bsed indexing
            }
        }
        return count;
    }
}