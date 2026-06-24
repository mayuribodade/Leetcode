class Solution {
    public char repeatedCharacter(String s) {
        boolean[] flag  = new boolean[26];
        for(int i=0 ; i<s.length() ; i++)
        {
            if( flag[s.charAt(i) - 97]){
                return s.charAt(i);
            }
            flag[s.charAt(i) - 97] = true;
        }
        return 'z';
    }
}