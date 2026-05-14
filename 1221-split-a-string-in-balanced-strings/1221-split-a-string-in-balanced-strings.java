class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            //R increases the balance
            if(ch == 'R'){
                balance++;
            }
            //else L decresases the balance
            else{
                balance--;
            }

            //now check balance is 0 or not if yes then there are eqaul L and R 
            if(balance == 0){
                count++;
            }
        }
        return count;
    }
}