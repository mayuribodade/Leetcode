class Solution {
    public int numSub(String s) {
        int mod = 1000000007;
        long count = 0;
        long add = 0;

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            else{
                long no_str = count*(count+1)/2;
                add = add + no_str;
                add = add % mod;
                count = 0;
            }
        }
        long no_str = count*(count+1)/2;
        add = add + no_str;
        add = add % mod;
        count = 0;

        return (int)add;
    }
}