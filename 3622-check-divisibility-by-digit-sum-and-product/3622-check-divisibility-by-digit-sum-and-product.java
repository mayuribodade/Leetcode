class Solution {
    public boolean checkDivisibility(int n) {
        int prod = 1;
        int sum = 0;
        int x = n;

        while(x>0){
            int lastdigit = x % 10;
            sum += lastdigit;
            prod *= lastdigit;

            x = x/10;
        }
        int resSum = sum + prod;

        return n % resSum == 0;

    }
}