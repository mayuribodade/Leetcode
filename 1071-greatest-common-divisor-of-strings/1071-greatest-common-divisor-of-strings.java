class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s1 = str1 + str2;
        String s2 = str2 + str1;

        //If they don't match when concatenated in both orders, the answer is always ""

        if(!s1.equals(s2)) return "";
        
        int GCD = gcd(str1.length() , str2.length());

        return str1.substring(0,GCD);
       
    }
    private int gcd(int a , int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}