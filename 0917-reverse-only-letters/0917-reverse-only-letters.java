class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left<=right){

             //(check either lowercase 'a-z' or uppercase 'A-Z')
            // matlab us position be character nahi he to move forward
            if(!Character.isLetter(chars[left])){
                left++;
            }
            //move backward
            else if(!Character.isLetter(chars[right])){
                right--;
            }
            //aur ab dono pointers ko reverse karo kyuki vo dono charcters consist krre he
            else{
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] =temp;

                //move pointers
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}