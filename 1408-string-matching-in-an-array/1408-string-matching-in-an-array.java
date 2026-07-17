class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans  = new ArrayList<>();
        for(int i=0 ; i<words.length ; i++){
            for(int j=0  ; j<words.length; j++){
                if( i!=j && words[j].contains(words[i])){
                    //only skip when both points to same word
                    // and j contains i  , i is substring of j
                    ans.add(words[i]);
                    break; // for unnecessary repetion in future
                }
            }
        }
        return ans;
    }
}