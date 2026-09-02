class Solution {
    public List<Integer> partitionLabels(String s) {
       HashMap<Character , Integer> map = new HashMap<>();
       //map store last occurence  index of each char
    
      for(int i=0 ; i<s.length();i++){
        char ch = s.charAt(i);
         map.put(ch , i);
      }

      List<Integer> ans  = new ArrayList<>();
      int maxidx = 0;
      int start =0 ;
      for(int i=0 ; i<s.length() ; i++){
          char ch = s.charAt(i);
          maxidx = Math.max(maxidx , map.get(ch));
          if(i == maxidx){
            int length = maxidx - start + 1;
            ans.add(length);
            start = maxidx+1; 
          }
      }
      return ans;
    }
}