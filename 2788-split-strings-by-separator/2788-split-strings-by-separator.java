class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
       List<String> list  = new ArrayList<>();

       for(int i=0 ;i<words.size() ; i++){
         String s = words.get(i);
         String[] a = s.split("\\" + separator);

         for(String x : a){
            //do not add empty string
            if(!x.isEmpty()){
                list.add(x);
            }
         }
       }
       return list;
    }
}