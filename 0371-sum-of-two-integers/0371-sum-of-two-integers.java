class Solution {
    public int getSum(int a, int b) {
      /*  int ans = (int) Math.round(Math.log(Math.exp(a) * Math.exp(b)));
        return ans;*/

        while(b != 0){
            int carry = (a & b) << 1;
            a = a^b;
            b = carry;
        }
        return a;
    }
}