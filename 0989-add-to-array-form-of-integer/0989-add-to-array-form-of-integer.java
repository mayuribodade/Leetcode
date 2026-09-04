class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        List<Integer> ans = new ArrayList<>();
        int p = num.length-1;

        while( p>=0 || k>0){
            int val = 0;//in case  if p pointer exceed araay

            if(p>=0){
                val = num[p];
            }
            int lastD = k%10; // last digit from k

            int sum = val + lastD + carry;

            int digit = sum%10;//like if sum is 12 we put 2 in ans and 1 in carry
            carry = sum/10;

            ans.add(digit);

            p--;
            k = k/10;

        }
        if(carry >0){
            ans.add(carry);
        }
        //now we have ans list in reverse order

        Collections.reverse(ans);
        return ans;
    }
}