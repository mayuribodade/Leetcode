class Solution {
    public boolean detectCapitalUse(String word) {
        int uc =0;
        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
                uc++;
            }
        }
        if(uc==0 || uc== word.length()){
          return true;
        }
        if(uc ==1 && Character.isUpperCase(word.charAt(0))) return true;
        else return false;
    }
}