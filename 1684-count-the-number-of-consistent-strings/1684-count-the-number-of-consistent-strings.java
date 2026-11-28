class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        for(int i=0 ; i<words.length ; i++){
            String str = words[i];
            boolean flag = true;

            for(int j=0 ; j<str.length() ; j++){
                char ch = str.charAt(j);

                if(!allowed.contains(String.valueOf(ch))){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}