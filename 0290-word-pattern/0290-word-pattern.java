class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] s1 = s.split(" ");

        if(pattern.length() != s1.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        for(int i=0 ; i<pattern.length() ; i++ ){
            if(map.containsKey(pattern.charAt(i))){
              if(!map.get(pattern.charAt(i)).equals(s1[i])) return false;
            }
            else{
                map.put(pattern.charAt(i) , s1[i]);
            }
        }
         HashMap<String , Character> map2 = new HashMap<>();
        for(int i=0 ; i<s1.length ; i++ ){
            if(map2.containsKey(s1[i])){
              if(!map2.get(s1[i]).equals(pattern.charAt(i))) return false;
            }
            else{
                map2.put(s1[i] , pattern.charAt(i));
            }
        }
        return true;
    }
}