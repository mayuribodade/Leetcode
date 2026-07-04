class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0 ; i<sentences.length ; i++){
            String s = sentences[i];
            String [] sword = s.split(" ");

            max = Math.max(max , sword.length);
        }
        return max;
    }
}