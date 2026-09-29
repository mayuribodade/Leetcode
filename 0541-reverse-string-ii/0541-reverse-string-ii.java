class Solution {
    public String reverseStr(String s, int k) {
        char [] a = s.toCharArray();
        int n = a.length;

        if(n<k){
           // reverse that whole string
           int S = 0;
           int e = a.length-1;

           while(S<e){
            char temp = a[S];
            a[S] = a[e];
            a[e] = temp;
            S++;
            e--;
           }
        }
        else if(n<2*k){
            //reverse first k characters
            rev(a,0,k-1);
        }
        else{
            //reverse k and every 2k char

           for(int i=0; i<n ; i+= 2*k){
                int left = i;
                int right = Math.min(i+ k-1 , n-1);
                //since i=2k , right = 2k+k-1 or when it goes out of boundary then take right as n-1

                rev(a,left,right);
           }
        }
        return new String(a);
    }
    private void rev(char[] a , int left,int right){
        while(left < right){
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}