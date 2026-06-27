class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];

        for(int i=0 ; i<text.length() ; i++){
            char ch = text.charAt(i);
            count[ch-97]++;
        }
        int b = count[1];
        int a = count[0];
        int l = count[11]/2;
        int o = count[14]/2;
        int n = count[13];

        //now take min from all and that number makes the how many term ballon formed

        //int ans = Math.min(b,a,l,o,n);
        //this method only takes 2 parameters

        int ans = Math.min(b,Math.min(a , Math.min(l , Math.min(o,n))));

        return ans;

    }
}