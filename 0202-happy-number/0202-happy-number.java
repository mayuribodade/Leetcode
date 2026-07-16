class Solution {
    public boolean isHappy(int n) {
        HashSet< Integer > set = new HashSet<>();
        while(n != 1){
            //check if num occurs previously , if yes then cycle creates , false
            if(set.contains(n)){return false;}

            //else
            set.add(n);
            n = sumOfSquares(n);
        }
        return true;
    }
    //helper function
    private int sumOfSquares(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;//last digit
            sum += digit * digit;
            num = num/10;
        }
        return sum;
    }
}