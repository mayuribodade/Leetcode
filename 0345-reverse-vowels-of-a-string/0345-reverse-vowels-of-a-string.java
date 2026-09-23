class Solution {
    public String reverseVowels(String s) {
        char [] a = s.toCharArray();
        int left = 0;
        int right = a.length -1;

        while(left<right){
            char c1 = a[left];
            char c2 = a[right];

            if (isVowel(c1) && isVowel(c2)){
                char temp = c1;
                a[left] = c2;
                a[right] = temp;
                 left++;
                 right--;
            }
           else if (isVowel(c1) &&  !isVowel(c2)){
            right--;
           }
           else{
            left++;
           }
        }

        return new String(a);

    }
    public boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);

        return c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u';
    }
}