class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0 ;

       StringBuilder ans = new StringBuilder();

       while(i>=0 || j>=0 || carry!=0){

        int x =0 ;
        int y = 0;

        if(i>=0 ){ 
            x = a.charAt(i) - '0';
        }
        if(j>=0){
            y = b.charAt(j) - '0';
        }
        int sum = (x+y+carry)%2;
        ans.append(sum );
        carry = (x+y+carry)/2;

        
        i--;
        j--;
       }
       return ans.reverse().toString();
    }
}