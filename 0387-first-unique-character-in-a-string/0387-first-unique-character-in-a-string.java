class Solution {
    public int firstUniqChar(String s) {
        //create array to store freq 
        int [] freq = new int[26];
        for(int i=0 ; i<s.length(); i++){
            //count freq
            freq[s.charAt(i)-'a']++;
        }
        //now find first char with feeq 1
        for(int i=0 ; i<s.length(); i++){
            if(freq[s.charAt(i) -'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}