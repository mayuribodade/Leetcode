class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;

       HashMap<Character,Integer > map = new HashMap<>();

       for(int i=0 ; i<s.length() ; i++){
            map.put(s.charAt(i) , i);
       }

       for(int j=0 ; j<t.length() ; j++){
         char ch = t.charAt(j);

         int i = map.get(ch);

         sum += Math.abs(j-i);
       }

        return sum;
    }
}