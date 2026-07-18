class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int x : nums){
            largest = Math.max(largest , x);
            smallest = Math.min(smallest , x);
        }
        return gcd(largest , smallest);
    }
    private int gcd(int a , int b){// largest , smallest
        if(b==0) return a;
        return gcd(b , a%b);
    }
}