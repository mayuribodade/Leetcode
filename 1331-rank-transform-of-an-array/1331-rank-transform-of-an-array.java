class Solution {
    public int[] arrayRankTransform(int[] arr) {

       if(arr.length == 0) return arr;

        int[] temp = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            temp[i] = arr[i];
        }
       Arrays.sort(temp);
       //remove duplicates from temp
       int j=1;
       for(int i=1 ; i<temp.length ; i++){
            if(temp[i] != temp[i-1]){
                temp[j] = temp[i];
                j++;
            }
       }
       HashMap<Integer,Integer> rank = new HashMap<>();

       for(int i=0 ; i<j ; i++){
         rank.put(temp[i] , i+1);
       }

        int [] ans = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            ans[i] = rank.get(arr[i]);
        }
        return ans;
    }
}