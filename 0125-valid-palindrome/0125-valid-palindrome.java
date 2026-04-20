class Solution {
    public boolean isPalindrome(String s) {
        //approach 
       /* Skip everything that is not letter or digit then
        step 2 remaning string convert it into to lowercase
         then two pointers left and right and compare both*/

         StringBuilder newCleanStr = new StringBuilder();

         for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                newCleanStr.append(Character.toLowerCase(ch));
            }
         }
         //we get amanaplanacanalpanama this type of string;
         int left = 0 ;
         int right = newCleanStr.length()-1;

         while(left<right){
            if(newCleanStr.charAt(left) != newCleanStr.charAt(right)){
                return false;
            }
            left++;
            right--;
         }
         return true;
    }
}