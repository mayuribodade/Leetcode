class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
       for(int i=0 ;i <26; i++){

        //charcter not present in string
           if(freq[i] == 0) continue;

           //decrese freq
           freq[i]--;

           //check all freq are equal or not
           if(checkEqual(freq)) return true;

          //if not restore freq;
           freq[i]++;
       }
       return false;
    }
    private boolean checkEqual(int[] freq){

        int flag = 0;

        for(int i=0; i<26 ; i++){

            if(freq[i] == 0)continue;

            // Store first non-zero frequency

            if(flag == 0){
                flag = freq[i];
            }

            //compare and check it will all other freq
           else if(freq[i] != flag) return false;
        }
        return true;
    }
}