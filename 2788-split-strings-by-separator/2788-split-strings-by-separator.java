class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
       List<String> list = new ArrayList<>();
    
       for(int i=0 ;i<words.size() ; i++){
         String s = words.get(i);
          
          String[] a = s.split("\\" + separator);
          for(String x : a)
          {// if some strings are empty dont include them
            if(!x.isEmpty())
                list.add(x) ; 
            }
       }
       return list;
    }
}