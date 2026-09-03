class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)return 1;

        int idx = 0;
        
        int i=0;
       while(i<chars.length){
            int count = 0;
            char ch = chars[i];

            while(i < chars.length && chars[i] ==  ch){
                count++;
                i++;
            }
            if(count == 1) chars[idx++] = ch;

            else  {
               chars[idx++] = ch;
               String str = String.valueOf(count);
               for(char digit : str.toCharArray()){
                chars[idx++] = digit;
               }
            }

        }
       return idx;
    }
}